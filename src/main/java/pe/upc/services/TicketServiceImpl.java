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
	    return (List<Ticket>)ticketRepository.findAll();
   }
}
