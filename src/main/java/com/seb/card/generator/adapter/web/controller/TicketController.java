package com.seb.card.generator.adapter.web.controller;

import com.seb.card.generator.adapter.mapper.DtoMapper;
import com.seb.card.generator.port.in.CreateTicketUseCase;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.TicketsApi;
import org.openapitools.model.CreateTicketRequestDto;
import org.openapitools.model.TicketDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class TicketController implements TicketsApi {
    private final CreateTicketUseCase ticketUseCase;
    private final DtoMapper mapper;

    @Override
    public TicketDto createTicket(CreateTicketRequestDto createTicketRequestDto) {
        final var request = mapper.toModel(createTicketRequestDto);
        var ticket = this.ticketUseCase.create(request);
        return mapper.toDto(ticket);
    }
}