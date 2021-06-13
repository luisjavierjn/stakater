package com.stakater.task.services;

import com.stakater.task.repositories.TaskRepositoryEnv;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskService implements ITaskService {

    @Autowired
    private TaskRepositoryEnv taskRepositoryEnv;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String getName() {
        return taskRepositoryEnv.getName();
    }
}
