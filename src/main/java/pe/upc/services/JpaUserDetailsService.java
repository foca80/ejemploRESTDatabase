package pe.upc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.upc.entities.Perfil;
import pe.upc.entities.Usuario;
import pe.upc.repository.UsuarioRepository;

@Service //Para SpringSecurity
public class JpaUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository userRepository;

	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = userRepository.findByUsername(username);

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (Perfil role : user.getPerfiles()) {
			authorities.add(new SimpleGrantedAuthority(role.getPerfil()));
		}

		return new User(user.getUsername(), user.getPassword(), user.getEstatus(), true, true, true, authorities);
	}

}
