package com.seb.card.generator.adapter.mapper;


import com.seb.card.generator.adapter.persistence.jpa.ticket.entity.TicketEntity;
import com.seb.card.generator.domain.model.ticket.CreateTicketRequest;
import com.seb.card.generator.domain.model.ticket.Ticket;
import org.mapstruct.Mapper;
import org.openapitools.model.CreateTicketRequestDto;
import org.openapitools.model.TicketDto;

@Mapper(componentModel = "spring", uses = {SessionMapper.class})
public interface TicketMapper {
    CreateTicketRequest toModel(CreateTicketRequestDto requestDto);
    Ticket toModel(TicketEntity entity);
    TicketEntity toEntity(Ticket ticket);
    TicketDto toDto(Ticket ticket);
}
