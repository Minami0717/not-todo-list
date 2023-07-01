package com.green.nottodolist.Data;

import com.green.nottodolist.Data.model.DataWeekSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {
    List<DataWeekSelVo> selWeeklyMoney();
    int selMonthMoney();
    int sellastMonthMoney();
}
