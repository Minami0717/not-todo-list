package com.green.nottodolist.Sum;

import com.example.demo.Sum.model.SumDto;
import com.example.demo.Sum.model.SumVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sum")
@RestController
@RequiredArgsConstructor
public class SumController {
    private final SumService service;

    @GetMapping
    public SumVo getSum(SumDto dto){
        return service.Sum(dto);
    }



}
