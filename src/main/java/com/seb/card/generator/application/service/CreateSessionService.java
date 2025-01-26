package com.seb.card.generator.application.service;

import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;

public interface CreateSessionService {
    Session build(CreateSessionRequest request);
}
