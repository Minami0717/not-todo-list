package com.green.nottodolist.Today;

import com.green.nottodolist.monthlyGoal.MonthlyGoalMapper;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import com.green.nottodolist.useList.UseListMapper;
import com.green.nottodolist.useList.model.UseListUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodayService {

    private final UseListMapper mapper;
    private final MonthlyGoalMapper goalMapper;

    public int updUseList(UseListUpdDto dto) {
        goalMapper.updSaveCost(dto);
        return mapper.updUseList(dto);
    }

    public List<MonthlyGoalVo> selTodayGoal(){
        return goalMapper.selMonthlyGoal();
    }


}
