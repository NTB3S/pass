package com.seb.card.generator.adapter.persistence.jpa;

import com.seb.card.generator.adapter.persistence.jpa.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSessionRepository extends JpaRepository<SessionEntity, String> {
}
