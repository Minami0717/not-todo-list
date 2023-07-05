package com.green.nottodolist.sum;

import com.green.nottodolist.sum.model.SumDto;
import com.green.nottodolist.sum.model.SumVo;
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
