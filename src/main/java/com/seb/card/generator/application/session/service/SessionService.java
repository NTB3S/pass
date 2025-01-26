package com.seb.card.generator.application.session.service;

import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;

public interface SessionService {
    Session build(CreateSessionRequest request);
}
