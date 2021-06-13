package com.stakater.task.services;

import com.stakater.task.domain.dto.DataDTO;
import com.stakater.task.domain.entities.Data;
import com.stakater.task.repositories.TaskRepositoryEnv;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {

    @Autowired
    private TaskRepositoryEnv taskRepositoryEnv;

    @Autowired
    private ModelMapper modelMapper;

    private DataDTO convertToDto(Data data) {
        DataDTO dataDto = modelMapper.map(data, DataDTO.class);
        dataDto.setName(data.getName());
        return dataDto;
    }

    @Override
    public DataDTO getData() {
        return convertToDto(taskRepositoryEnv.getData());
    }
}
