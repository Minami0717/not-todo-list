package com.green.nottodolist.useList;

import com.green.nottodolist.useList.model.UseListDailyVo;
import com.green.nottodolist.useList.model.UseListInsDto;
import com.green.nottodolist.useList.model.UseListMonthVo;
import com.green.nottodolist.useList.model.UseListUpdDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UseListMapper {
    int insUseList(List<UseListInsDto> dto);
    int updUseList(UseListUpdDto dto);
    List<UseListMonthVo> selUseListByMonth(String yearMonth);
    List<UseListDailyVo> selUseListByDay(String day);
}
