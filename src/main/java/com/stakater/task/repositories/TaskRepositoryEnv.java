package com.stakater.task.repositories;

import com.stakater.task.domain.entities.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TaskRepositoryEnv {

    private final String name;

    @Autowired
    public TaskRepositoryEnv(@Qualifier("nameArgument") String name) {
        this.name = name;
    }

    public Data getData() { return Data.builder().name(name).build(); }
}
