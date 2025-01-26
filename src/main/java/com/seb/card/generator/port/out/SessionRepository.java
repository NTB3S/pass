package com.seb.card.generator.port.out;

import com.seb.card.generator.domain.model.session.Session;

import java.util.Optional;

public interface SessionRepository {
    Session save(Session session);
    Optional<Session> findById(String id);
}
