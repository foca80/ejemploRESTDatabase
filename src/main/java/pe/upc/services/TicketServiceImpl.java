package pe.upc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upc.entities.Ticket;
import pe.upc.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{
	@Autowired
	private TicketRepository ticketRepository;
	
   public List<Ticket> list(){	   
	   List<Ticket> lista = (List<Ticket>)ticketRepository.findAll();
	  /*double subtotal =0;
	   int i=0;
       for (Ticket ticket:lista) {
    	   Ticket t = (Ticket)lista.get(i);//lees la fila
    	   subtotal = t.getQuantity()*t.getPrice();
    	   t.setSubTotal(subtotal);
    	   lista.set(i, t);
    	   i++;
       }
       */
       //lo comentado funciona, sin embargo, está forma es más corta, usando funciones Lambda 
       lista.forEach(ticket -> ticket.setSubTotal(ticket.getPrice()*ticket.getQuantity()));
	   return lista;
   }
}
