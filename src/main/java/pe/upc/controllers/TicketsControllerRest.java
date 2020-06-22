package pe.upc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.upc.entities.Ticket;
import pe.upc.services.TicketService;

@RestController
@RequestMapping("/api")
public class TicketsControllerRest {
   @Autowired
   private TicketService ticketService;
   
   @GetMapping("/tickets")
   public List<Ticket> listTickets(){
	   return ticketService.list();
   }
  
}
