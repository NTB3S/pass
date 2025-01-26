package com.seb.card.generator.adapter.persistence.jpa;

import com.seb.card.generator.adapter.persistence.jpa.entity.SessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface JpaSessionRepository extends JpaRepository<SessionEntity, String> {
    @Query("SELECT s FROM Ticket t JOIN t.sessions s WHERE s.id = :sessionId AND t.id = :ticketId")
    Optional<SessionEntity> findSessionByIdAndTicketId(@Param("sessionId") String sessionId, @Param("ticketId") String ticketId);

}
