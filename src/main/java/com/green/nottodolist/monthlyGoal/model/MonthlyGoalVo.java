package com.green.nottodolist.monthlyGoal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MonthlyGoalVo {
    private int goalId;
    private String notTodo;
    private String goalCost;
    private String useCostSum;
    private String monthYear;
}
