package com.green.nottodolist.monthlyGoal.model;

import lombok.Data;

@Data
public class MonthlyGoalUpdDto {
    private int goalId;
    private String notTodo;
    private String costCategory;
    private int goalCost;
}
