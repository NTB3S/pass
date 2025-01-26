package com.seb.card.generator.domain.exception;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

/**
 * Exception thrown when domain validation fails.
 * This exception contains a list of validation errors.
 */
@Getter
public class InvalidDomainCreationException extends RuntimeException {
    /**
     *  List of validation errors.
     */
    private final List<ValidationError> errors;

    /**
     * Constructs an InvalidDomainException with the given list of validation errors.
     *
     * @param errors List of validation errors
     */
    public InvalidDomainCreationException(List<ValidationError> errors) {
        super("Domain validation failed: " + formatErrors(errors));
        this.errors = Collections.unmodifiableList(errors);
    }

    /**
     * Constructs an InvalidDomainException with a custom message and a list of validation errors.
     *
     * @param message Custom message describing the exception
     * @param errors List of validation errors
     */
    public InvalidDomainCreationException(String message, List<ValidationError> errors) {
        super(message);
        this.errors = Collections.unmodifiableList(errors);
    }

    /**
     * Constructs an InvalidDomainException with a custom message, cause, and validation errors.
     *
     * @param message Custom message describing the exception
     * @param cause   The cause of the exception (can be null)
     * @param errors  List of validation errors
     */
    public InvalidDomainCreationException(String message, Throwable cause, List<ValidationError> errors) {
        super(message, cause);
        this.errors = Collections.unmodifiableList(errors);
    }

    /**
     * Constructs an InvalidDomainException with a cause and a list of validation errors.
     *
     * @param cause  The cause of the exception (can be null)
     * @param errors List of validation errors
     */
    public InvalidDomainCreationException(Throwable cause, List<ValidationError> errors) {
        super(cause);
        this.errors = Collections.unmodifiableList(errors);
    }

    /**
     * Formats a list of validation errors into a readable string.
     *
     * @param errors List of validation errors
     * @return A formatted string representing the errors
     */
    private static String formatErrors(List<ValidationError> errors) {
        final var formattedErrors = new StringBuilder();
        for (final ValidationError error : errors) {
            formattedErrors.append(error.toString()).append("; ");
        }
        return formattedErrors.toString();
    }
}