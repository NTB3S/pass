package com.seb.card.generator.adapter.persistence.jpa;

import com.seb.card.generator.adapter.mapper.EntityMapper;
import com.seb.card.generator.domain.model.ticket.Ticket;
import com.seb.card.generator.port.out.TicketRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TicketRepositoryAdapter implements TicketRepository {

    private final JpaTicketRepository ticketRepository;
    private final EntityMapper mapper;

    @Override
    public Ticket save(Ticket ticket) {
        final var entity = mapper.toEntity(ticket);
        final var savedEntity = this.ticketRepository.save(entity);
        return mapper.toModel(savedEntity);
    }
}
