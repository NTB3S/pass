package com.seb.card.generator.adapter.persistence.jpa.ticket;

import com.seb.card.generator.adapter.persistence.jpa.ticket.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTicketRepository extends JpaRepository<TicketEntity, String> {
}
