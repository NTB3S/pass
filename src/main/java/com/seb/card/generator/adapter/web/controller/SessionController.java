package com.seb.card.generator.adapter.web.controller;


import lombok.RequiredArgsConstructor;
import org.openapitools.api.SessionsApi;
import org.openapitools.model.SessionDto;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SessionController implements SessionsApi {

    @Override
    public SessionDto getSessionById(String ticketId, String sessionId) {
        return null;
    }
}
