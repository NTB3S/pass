package com.seb.card.generator.port.in;


import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;

public interface CreateSessionUseCase {
    Session create(CreateSessionRequest request);
}
