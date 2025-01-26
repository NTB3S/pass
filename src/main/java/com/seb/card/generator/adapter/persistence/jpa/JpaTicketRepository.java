package com.seb.card.generator.adapter.persistence.jpa;

import com.seb.card.generator.adapter.persistence.jpa.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTicketRepository extends JpaRepository<TicketEntity, String> {
}
