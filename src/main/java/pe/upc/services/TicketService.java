package pe.upc.services;

import java.util.List;

import pe.upc.entities.Ticket;
import pe.upc.repository.TicketRepository;

public interface TicketService {	
	   public List<Ticket> list();
}
