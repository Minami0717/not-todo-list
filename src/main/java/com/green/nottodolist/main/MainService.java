package com.green.nottodolist.main;

import com.example.nottodolisttest.main.model.*;
import com.example.nottodolisttest.memo.MemoMapper;
import com.example.nottodolisttest.monthlyGoal.MonthlyGoalMapper;
import com.example.nottodolisttest.monthlyGoal.model.MonthDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
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
                .goalList(goalMapper.selMonthlyGoal())
                .saveStats(saveStatsVo)
                .build();
    }
}
