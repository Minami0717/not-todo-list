package com.green.nottodolist.Data;

import com.example.nottodolisttest.Data.model.DataWeekSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataService {
    private final DataMapper mapper;

    public List<DataWeekSelVo> selWeeklyMoney(){
        return mapper.selWeeklyMoney();
    };
    int selMonthMoney(){
        return mapper.selMonthMoney();
    }
    int sellastMonthMoney(){
        return mapper.sellastMonthMoney();
    }

}
