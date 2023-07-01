package com.green.nottodolist.notTodo.model;

import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class MainPageVo {
    private String memo;
    private List<MonthlyGoalVo> goalList;
    private SaveStatsVo saveStats;
}
