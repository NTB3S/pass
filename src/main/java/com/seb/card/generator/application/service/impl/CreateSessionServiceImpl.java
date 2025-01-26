package com.seb.card.generator.application.service.impl;

import com.seb.card.generator.application.service.CreateSessionService;
import com.seb.card.generator.application.utils.IdUtils;
import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;
import com.seb.card.generator.port.in.CreateSessionUseCase;
import com.seb.card.generator.port.out.SessionRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CreateSessionServiceImpl implements CreateSessionUseCase, CreateSessionService {

    private final SessionRepository repository;

    @Override
    public Session create(CreateSessionRequest request) {
        final var session = this.build(request);
        return saveToRepository(session);
    }

    @Override
    public Session saveToRepository(Session sessionToSave){
        return repository.save(sessionToSave);
    }

    @Override
    public List<Session> saveAllToRepository(List<Session> sessions) {
        return repository.saveAll(sessions);
    }

    @Override
    public Session build(CreateSessionRequest request) {
        return new Session(IdUtils.generateId(),
                request.dueDate(),
                request.description());

    }
}
