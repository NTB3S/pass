package com.seb.card.generator.port.in;

import com.seb.card.generator.domain.model.ticket.CreateTicketRequest;
import com.seb.card.generator.domain.model.ticket.Ticket;

public interface CreateTicketUseCase {
    Ticket create(CreateTicketRequest ticketRequest);
}
