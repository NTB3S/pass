package com.seb.card.generator.application.service.usecase;

import com.seb.card.generator.application.service.SessionService;
import com.seb.card.generator.domain.model.session.Session;
import com.seb.card.generator.port.in.CancelSessionUseCase;
import com.seb.card.generator.port.out.SessionRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class SessionUseCaseImpl implements CancelSessionUseCase {

    private final SessionRepository repository;
    private final SessionService service;

    @Override
    public Optional<Session> cancel(String sessionId) {
        var session = this.repository.findById(sessionId);

        return session.map(s -> {
            var cancelledSession = this.service.cancel(s);
            return this.repository.save(cancelledSession);
        });
    }
}
