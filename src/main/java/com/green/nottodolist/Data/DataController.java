package com.green.nottodolist.Data;


import com.example.nottodolisttest.Data.model.DataWeekSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class DataController {
    private final DataService service;

    @GetMapping("/weekly")
    public List<DataWeekSelVo> getSelWeekMoney(){
        return service.selWeeklyMoney();
    }
    @GetMapping
    public int getSelMonthMoney(){
        return service.selMonthMoney();
    }
    @GetMapping("/last")
    public int getSellastMonthMoney(){
        return service.sellastMonthMoney();
    }

}
