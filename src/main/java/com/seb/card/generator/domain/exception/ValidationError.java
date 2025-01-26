package com.seb.card.generator.domain.exception;

public record ValidationError(String field, String cause) {
}
