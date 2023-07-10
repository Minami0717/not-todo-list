package com.green.nottodolist.data;

import com.green.nottodolist.data.model.DataCostVo;
import com.green.nottodolist.data.model.DataWeekSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DataMapper {
    List<DataWeekSelVo> selWeeklyMoney(int memberId);

    List<DataWeekSelVo> selWeeklyTime(int memberId);

    List<DataCostVo> selMonthlyMoney(int memberId);

    List<DataCostVo> selMonthlyTime(int memberId);
}
