package com.green.nottodolist.useList;

import com.example.nottodolisttest.useList.model.UseListInsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UseListMapper {
    int insUseList(List<UseListInsDto> dto);
    int selSumCostByGoalId(int goalId);
}
