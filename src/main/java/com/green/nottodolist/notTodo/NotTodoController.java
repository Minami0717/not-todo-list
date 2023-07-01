package com.green.nottodolist.notTodo;

import com.example.nottodolisttest.notTodo.model.MainPageDto;
import com.example.nottodolisttest.notTodo.model.MainPageVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/not-todo")
@RequiredArgsConstructor
public class NotTodoController {
    private final NotTodoService service;

    @GetMapping
    public MainPageVo getMainData(MainPageDto dto) {
        return service.getMainData(dto);
    }
}
