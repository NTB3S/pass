package com.seb.card.generator.adapter.persistence.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Builder
@Getter
@NoArgsConstructor(access =  AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class TicketEntity {
    @Id
    private String id;
    private String issuer;
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private Set<SessionEntity> sessions;
}
