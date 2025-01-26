package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.adapter.persistence.jpa.session.entity.SessionEntity;
import com.seb.card.generator.domain.model.session.Session;
import org.mapstruct.Mapper;
import org.openapitools.model.SessionDto;

@Mapper(componentModel = "spring", uses = GenericMapper.class)
public interface SessionMapper {
    SessionEntity toEntity(Session session);
    Session toModel(SessionEntity session);
    SessionDto toDto(Session session);

}
