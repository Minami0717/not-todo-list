package com.green.nottodolist.sum.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SumVo {
    private MaxSaveMoneyVo maxSaveMoney;
    private MaxSaveTimeVo maxSaveTime;
    private String sumSaveMoney;
    private String sumSaveTime;
}