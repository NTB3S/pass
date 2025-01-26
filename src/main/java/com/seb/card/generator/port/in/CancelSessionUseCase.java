package com.seb.card.generator.port.in;

import com.seb.card.generator.domain.model.session.Session;

import java.util.Optional;

public interface CancelSessionUseCase {
    Optional<Session> cancel(String sessionId);
}
