package com.green.nottodolist.notTodo;

import com.example.nottodolisttest.memo.MemoMapper;
import com.example.nottodolisttest.monthlyGoal.MonthlyGoalMapper;
import com.example.nottodolisttest.monthlyGoal.model.MonthDto;
import com.example.nottodolisttest.notTodo.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotTodoService {
    private final MemoMapper memoMapper;
    private final MonthlyGoalMapper goalMapper;

    public MainPageVo getMainData(MainPageDto dto) {
        MaxSaveMoneyVo vo = goalMapper.selMaxSaveMoney();
        MaxSaveTimeVo vo1 = goalMapper.selMaxSaveTime();

        MonthDto monthDto = new MonthDto(dto.getStartMonth(), dto.getEndMonth());

        SaveStatsVo saveStatsVo = new SaveStatsVo(vo.getMonthYear(), vo.getMaxSaveMoney(),
                vo1.getMonthYear(), vo1.getMaxSaveTime(),
                goalMapper.selSumSaveMoney(monthDto), goalMapper.selSumSaveTime(monthDto));

        return MainPageVo.builder()
                .memo(memoMapper.selMemo())
                .goalList(goalMapper.selMonthlyGoal(dto.getMonthYear()))
                .saveStats(saveStatsVo)
                .build();
    }
}
