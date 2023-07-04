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
    private final int costCategoryId;
    private final int goalCost;
    private String costCategory;

    public void setCostCategory(String costCategory) {
        this.costCategory = costCategory;
    }
}
