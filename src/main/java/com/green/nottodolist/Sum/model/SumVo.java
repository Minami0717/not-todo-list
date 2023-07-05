package com.green.nottodolist.Sum.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SumVo {
    private MaxSaveMoneyVo maxSaveMoney;
    private MaxSaveTimeVo maxSaveTime;
    private int sumSaveMoney;
    private int sumSaveTime;
}
