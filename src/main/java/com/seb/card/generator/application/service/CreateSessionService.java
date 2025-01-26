package com.seb.card.generator.application.service;

import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;

import java.util.List;

public interface CreateSessionService {
    Session saveToRepository(Session session);
    List<Session> saveAllToRepository(List<Session> sessions);
    Session build(CreateSessionRequest request);
}
