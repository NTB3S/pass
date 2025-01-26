package com.seb.card.generator.adapter.web.controller;


import com.seb.card.generator.adapter.mapper.DtoMapper;
import com.seb.card.generator.port.in.CancelSessionUseCase;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.SessionsApi;
import org.openapitools.model.SessionDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@RestController
public class SessionController implements SessionsApi {

    private final CancelSessionUseCase cancelSessionUseCase;
    private final DtoMapper mapper;

    @Override
    public SessionDto cancelSession(String sessionId) {
        var cancelledSession = this.cancelSessionUseCase.cancel(sessionId);
        if(cancelledSession.isEmpty()){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "session not found"
            );
        }
        return this.mapper.toDto(cancelledSession.get());
    }
}
