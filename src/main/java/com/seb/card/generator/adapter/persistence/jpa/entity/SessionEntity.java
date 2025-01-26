package com.seb.card.generator.adapter.persistence.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Builder
@Entity
@Getter
@NoArgsConstructor(access =  AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class SessionEntity {
    @Id
    private String id;
    private String description;
    private LocalDate dueDate;
    private LocalDate completionDate;
    private Boolean isCancelled;
}
