package com.green.nottodolist.Data;

import com.green.nottodolist.Data.model.DataCostVo;
import com.green.nottodolist.Data.model.DataWeekSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {
    List<DataWeekSelVo> selWeeklyMoney();
    List<DataWeekSelVo> selWeeklyTime();
    List<DataCostVo> selMonthMoney();
    List<DataCostVo> selMonthTime();


}
