package com.seb.card.generator.application.utils;

import java.util.UUID;

public final class IdUtils {

    private IdUtils(){}

    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
