package com.seb.card.generator.application.session.usecase;

import com.seb.card.generator.application.session.service.SessionService;
import com.seb.card.generator.port.out.SessionRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SessionUseCaseImpl {
    private final SessionRepository repository;
    private final SessionService service;
}
