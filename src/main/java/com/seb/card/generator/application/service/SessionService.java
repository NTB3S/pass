package com.seb.card.generator.application.service;

import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;

public interface SessionService {
    Session build(CreateSessionRequest request);
    Session cancel(Session sessionToCancel);
}
