package com.seb.card.generator.port.out;

import com.seb.card.generator.domain.model.session.Session;

import java.util.List;

public interface SessionRepository {
    Session save(Session session);
    List<Session> saveAll(List<Session> sessions);
}
