package com.seb.card.generator.application.ticket.usecase;

import com.seb.card.generator.application.session.service.SessionService;
import com.seb.card.generator.application.utils.IdUtils;
import com.seb.card.generator.domain.model.ticket.CreateTicketRequest;
import com.seb.card.generator.domain.model.ticket.Ticket;
import com.seb.card.generator.port.in.CreateTicketUseCase;
import com.seb.card.generator.port.out.TicketRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateTicketUseCaseImpl implements CreateTicketUseCase {

    private final TicketRepository repository;
    private final SessionService createSession;

    @Override
    public Ticket create(CreateTicketRequest ticketRequest) {

        final var sessions = ticketRequest.sessions().stream().map(
                this.createSession::build
        ).toList();

        final var ticket = new Ticket(IdUtils.generateId(), ticketRequest.issuer(),
                ticketRequest.firstName(), ticketRequest.lastName(), sessions);

        return this.repository.save(ticket);
    }
}
