package com.seb.card.generator.adapter.web.controller;

import com.seb.card.generator.adapter.mapper.SessionMapper;
import com.seb.card.generator.port.in.CreateSessionUseCase;
import lombok.RequiredArgsConstructor;
import org.openapitools.model.CreateSessionRequestDto;
import org.openapitools.model.SessionDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("tickets/{id}/sessions")
public class SessionController{
    private final CreateSessionUseCase sessionUseCase;
    private final SessionMapper mapper;

    @PostMapping
    public SessionDto create(@RequestBody CreateSessionRequestDto dto){
        final var request = this.mapper.toModel(dto);
        final var session = this.sessionUseCase.create(request);
        return mapper.toDto(session);
    }
}
