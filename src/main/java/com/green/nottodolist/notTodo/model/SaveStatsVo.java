package com.green.nottodolist.notTodo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SaveStatsVo {
    private String maxMoneyMonth;
    private int maxSaveMoney;
    private String maxTimeMonth;
    private int maxSaveTime;
    private int sumSaveMoney;
    private int sumSaveTime;
}
