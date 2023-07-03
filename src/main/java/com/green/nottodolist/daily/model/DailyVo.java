package com.green.nottodolist.daily.model;

import lombok.Data;

@Data
public class DailyVo {
    private String name;
    private String costCategory;
    private int costCategoryId;
    private int cost;
    private String useListId;
}
