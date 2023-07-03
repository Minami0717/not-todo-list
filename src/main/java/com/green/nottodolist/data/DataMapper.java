package com.green.nottodolist.data;

import com.green.nottodolist.data.model.DataCostVo;
import com.green.nottodolist.data.model.DataWeekSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {
    List<DataWeekSelVo> selWeeklyMoney();

    List<DataWeekSelVo> selWeeklyTime();

    List<DataCostVo> selMonthMoney();

    List<DataCostVo> selMonthTime();
}
