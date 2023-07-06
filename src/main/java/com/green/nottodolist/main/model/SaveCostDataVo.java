package com.green.nottodolist.main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SaveCostDataVo {
    private MaxSaveMoneyVo maxSaveMoney;
    private MaxSaveTimeVo maxSaveTime;
    private String sumSaveMoney;
    private String sumSaveTime;
}
