package com.green.nottodolist.Data;

import com.example.nottodolisttest.Data.model.DataWeekSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {
    List<DataWeekSelVo> selWeeklyMoney();
    int selMonthMoney();
    int sellastMonthMoney();
}
