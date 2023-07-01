package com.green.nottodolist.notTodo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MaxSaveTimeVo {
    private String monthYear;
    private int maxSaveTime;
}
