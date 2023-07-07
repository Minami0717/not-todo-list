package com.green.nottodolist.monthlyGoal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MonthlyGoalDetailVo {
    private final int goalId;
    private final String monthYear;
    private final String notTodo;
    private final String goalCost;
    private String costCategory;
    private final int costCategoryId;

    public void setCostCategory(String costCategory) {
        this.costCategory = costCategory;
    }
}
