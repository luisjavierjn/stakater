package com.stakater.task.repositories;

import org.springframework.stereotype.Component;

@Component
public class TaskRepositoryEnv {

    public static final String NAME = "Stakater";

    public String getName() { return NAME; }
}
