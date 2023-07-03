package com.green.nottodolist.main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MaxSaveTimeVo {
    private String monthYear;
    private int maxSaveTime;
}
