package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.adapter.persistence.jpa.entity.SessionEntity;
import com.seb.card.generator.adapter.persistence.jpa.entity.TicketEntity;
import com.seb.card.generator.domain.model.session.Session;
import com.seb.card.generator.domain.model.ticket.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = GenericMapper.class)
public interface EntityMapper {
    SessionEntity toEntity(Session session);
    Session toModel(SessionEntity session);
    Ticket toModel(TicketEntity entity);
    TicketEntity toEntity(Ticket ticket);
}
