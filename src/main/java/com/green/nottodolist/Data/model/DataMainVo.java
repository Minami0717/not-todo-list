package com.green.nottodolist.Data.model;


import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class DataMainVo {
    private List<DataWeekSelVo> weeklyMoney;
    private List<DataWeekSelVo> weeklyTime;
    private List<DataCostVo> monthMoney;
    private List<DataCostVo> monthTime;
}
