package com.green.nottodolist.Daily.model;

import lombok.Data;

@Data
public class DailyVo {
    private String name;
    private String date;
    private String costCategory;
    private int costCategoryId;
    private int cost;
}
