package com.stakater.task.repositories;

import com.stakater.task.domain.entities.Data;
import org.springframework.stereotype.Component;

@Component
public class TaskRepositoryEnv {

    public static final String ENV_NAME = "NAME";

    public Data getData() { return Data.builder().name(System.getenv(ENV_NAME)).build(); }
}
