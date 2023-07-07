package com.green.nottodolist.monthlyGoal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MonthlyGoalVo {
    private final int goalId;
    private final String notTodo;
    private final String goalCost;
    private final String useCostSum;
    private String costCategory;
    private final int costCategoryId;

    public void setCostCategory(String costCategory) {
        this.costCategory = costCategory;
    }
}
