package com.seb.card.generator.application.service.impl;

import com.seb.card.generator.application.service.CreateSessionService;
import com.seb.card.generator.application.utils.IdUtils;
import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateSessionServiceImpl implements CreateSessionService {

    @Override
    public Session build(CreateSessionRequest request) {
        return new Session(IdUtils.generateId(),
                request.dueDate(),
                request.description());

    }
}
