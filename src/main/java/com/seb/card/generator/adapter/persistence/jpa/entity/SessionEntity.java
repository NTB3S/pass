package com.seb.card.generator.adapter.persistence.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class SessionEntity {
    @Id
    private String id;
    private String description;
    private LocalDate dueDate;
    private LocalDate completionDate;
    private Boolean isCancelled;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private TicketEntity ticket;
}
