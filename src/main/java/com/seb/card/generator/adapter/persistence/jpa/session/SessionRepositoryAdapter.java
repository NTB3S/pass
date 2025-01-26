package com.seb.card.generator.adapter.persistence.jpa.session;

import com.seb.card.generator.adapter.mapper.SessionMapper;
import com.seb.card.generator.domain.model.session.Session;
import com.seb.card.generator.port.out.SessionRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SessionRepositoryAdapter implements SessionRepository {

    private final JpaSessionRepository repository;
    private final SessionMapper mapper;

    @Override
    public Session save(Session session) {
        final var entity = mapper.toEntity(session);
        final var savedEntity = this.repository.save(entity);
        return mapper.toSession(savedEntity);
    }

    @Override
    public List<Session> saveAll(List<Session> sessions) {
        return List.of();
    }
}
