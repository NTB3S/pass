package com.seb.card.generator.adapter.web.controller;

import com.seb.card.generator.adapter.mapper.CreateTicketMapper;
import com.seb.card.generator.adapter.mapper.TicketMapper;
import com.seb.card.generator.port.in.CreateTicketUseCase;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.TicketsApi;
import org.openapitools.model.CreateTicketRequestDto;
import org.openapitools.model.TicketDto;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TicketController implements TicketsApi {
    private final CreateTicketUseCase ticketUseCase;
    private final TicketMapper ticketMapper;
    private final CreateTicketMapper createTicketMapper;


    @Override
    public TicketDto createTicket(CreateTicketRequestDto createTicketRequestDto) {
        final var request = createTicketMapper.toModel(createTicketRequestDto);
        var ticket = this.ticketUseCase.create(request);
        return ticketMapper.toDto(ticket);
    }
}