package com.green.nottodolist.monthlyGoal.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MonthlyGoalEntity {
    private int goalId;
    private int notTodoId;
    private int costCategory;
    private String goalCost;
    private String monthYear;
    private String saveCost;
}
