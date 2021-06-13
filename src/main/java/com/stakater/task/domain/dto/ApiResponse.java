package com.stakater.task.domain.dto;

import lombok.Getter;

@Getter
public class ApiResponse<T> {

    private final int status;
    private final String message;
    private final Object result;

    public ApiResponse(int status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }
}
