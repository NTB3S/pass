package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.domain.model.ticket.CreateTicketRequest;
import org.mapstruct.Mapper;
import org.openapitools.model.CreateTicketRequestDto;

@Mapper(componentModel = "spring", uses = {CreateSessionMapper.class})
public interface CreateTicketMapper {
    CreateTicketRequest toModel(CreateTicketRequestDto requestDto);

}
