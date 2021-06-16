package com.stakater.task.controllers;

import com.stakater.task.domain.dto.ApiResponse;
import com.stakater.task.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    public static final String INFO_RETRIEVED_SUCCESSFULLY = "Info retrieved successfully";

    @Autowired
    TaskService taskService;

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping(value = "/name", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ApiResponse<String> getName() {
        return new ApiResponse<>(HttpStatus.OK.value(),INFO_RETRIEVED_SUCCESSFULLY, taskService.getData().getName());
    }
}
