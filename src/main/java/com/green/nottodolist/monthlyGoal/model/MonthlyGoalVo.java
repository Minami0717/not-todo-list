package com.green.nottodolist.monthlyGoal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MonthlyGoalVo {
    private int goalId;
    private String notTodo;
    private int goalCost;
    private int useCostSum;
    private String monthYear;
}
