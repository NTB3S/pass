package com.seb.card.generator.adapter.persistence.jpa.session;

import com.seb.card.generator.adapter.persistence.jpa.session.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSessionRepository extends JpaRepository<SessionEntity, String> {
}
