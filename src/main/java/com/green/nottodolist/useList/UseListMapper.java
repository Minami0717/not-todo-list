package com.green.nottodolist.useList;

import com.example.nottodolisttest.useList.model.UseListDailyVo;
import com.example.nottodolisttest.useList.model.UseListInsDto;
import com.example.nottodolisttest.useList.model.UseListMonthVo;
import com.example.nottodolisttest.useList.model.UseListUpdDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UseListMapper {
    int insUseList(List<UseListInsDto> dto);
    int updUseList(UseListUpdDto dto);
    List<UseListMonthVo> selUseListByMonth(String yearMonth);
    List<UseListDailyVo> selUseListByDay(String day);
}
