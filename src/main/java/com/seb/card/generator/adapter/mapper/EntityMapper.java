package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.adapter.persistence.jpa.entity.SessionEntity;
import com.seb.card.generator.adapter.persistence.jpa.entity.TicketEntity;
import com.seb.card.generator.domain.model.session.Session;
import com.seb.card.generator.domain.model.ticket.Ticket;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.Optional;

@Mapper(componentModel = "spring", uses = GenericMapper.class)
public interface EntityMapper {
    SessionEntity toEntity(Session session);
    Session toModel(SessionEntity session);
    Ticket toModel(TicketEntity entity);
    TicketEntity toEntity(Ticket ticket);

    @AfterMapping
    default void setTicket(@MappingTarget TicketEntity ticket) {
        Optional.ofNullable(ticket.getSessions())
                .ifPresent(it -> it.
                                forEach(session -> session.setTicket(ticket)));
    }
}
