package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.adapter.web.advice.dto.ValidationErrorDto;
import com.seb.card.generator.domain.exception.ValidationError;
import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;
import com.seb.card.generator.domain.model.ticket.CreateTicketRequest;
import com.seb.card.generator.domain.model.ticket.Ticket;
import org.mapstruct.Mapper;
import org.openapitools.model.CreateSessionRequestDto;
import org.openapitools.model.CreateTicketRequestDto;
import org.openapitools.model.SessionDto;
import org.openapitools.model.TicketDto;

import java.util.List;

@Mapper(componentModel = "spring", uses = GenericMapper.class)
public interface DtoMapper {
    CreateSessionRequest toModel(CreateSessionRequestDto sessionRequestDto);

    List<CreateSessionRequest> toModel(List<CreateSessionRequestDto> sessionRequestDto);

    CreateTicketRequest toModel(CreateTicketRequestDto requestDto);

    SessionDto toDto(Session session);

    TicketDto toDto(Ticket ticket);

    List<ValidationErrorDto> toDto(List<ValidationError> validationError);


}
