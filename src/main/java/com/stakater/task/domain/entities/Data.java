package com.stakater.task.domain.entities;

import lombok.Builder;

@Builder
public class Data {
    private final String name;

    public String getName() {
        return name;
    }
}
