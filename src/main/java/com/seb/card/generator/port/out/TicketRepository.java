package com.seb.card.generator.port.out;

import com.seb.card.generator.domain.model.ticket.Ticket;

public interface TicketRepository {
    Ticket save(Ticket ticket);
}
