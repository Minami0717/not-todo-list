package com.green.nottodolist.monthlyGoal.model;

import lombok.Data;

@Data
public class MonthlyGoalInsDto {
    private String notTodo;
    private String costCategory;
    private int goalCost;
    private String monthYear;
}
