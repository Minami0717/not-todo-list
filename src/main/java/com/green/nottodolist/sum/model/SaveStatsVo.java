package com.green.nottodolist.sum.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SaveStatsVo {
    private String maxMoneyMonth;
    private String maxSaveMoney;
    private String maxTimeMonth;
    private String maxSaveTime;
    private String sumSaveMoney;
    private String sumSaveTime;
}
