package com.seb.card.generator.adapter.web.advice;

public record ValidationErrorDto(String field, String cause) {
}
