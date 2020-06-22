package pe.upc.repository;

import org.springframework.data.repository.CrudRepository;

import pe.upc.entities.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

}
