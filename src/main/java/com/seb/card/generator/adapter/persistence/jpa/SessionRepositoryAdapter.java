package com.seb.card.generator.adapter.persistence.jpa;

import com.seb.card.generator.adapter.mapper.EntityMapper;
import com.seb.card.generator.domain.model.session.Session;
import com.seb.card.generator.port.out.SessionRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class SessionRepositoryAdapter implements SessionRepository {

    private final JpaSessionRepository repository;
    private final EntityMapper mapper;

    @Override
    public Session save(Session session) {
        final var entity = mapper.toEntity(session);
        final var savedEntity = this.repository.save(entity);
        return mapper.toModel(savedEntity);
    }

    @Override
    public Optional<Session> findByTicketIdAndSessionId(String ticketId, String sessionId) {
        return Optional.empty();
    }
}
