package com.green.nottodolist.useList.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UseListDailyVo {
    private final String notTodo;
    private final int costCategoryId;
    private final String useCost;
    private String costCategory;

    public void setCostCategory(String costCategory) {
        this.costCategory = costCategory;
    }
}
