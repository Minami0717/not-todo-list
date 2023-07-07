package com.green.nottodolist.daily.model;

import lombok.Data;

@Data
public class DailyVo {
    private int useListId;
    private int goalId;
    private String name;
    private String costCategory;
    private int costCategoryId;
    private String useCost;
}
