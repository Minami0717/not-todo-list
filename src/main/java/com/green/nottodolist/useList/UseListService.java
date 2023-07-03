package com.green.nottodolist.useList;

import com.green.nottodolist.monthlyGoal.MonthlyGoalMapper;
import com.green.nottodolist.useList.model.UseListDailyVo;
import com.green.nottodolist.useList.model.UseListMonthVo;
import com.green.nottodolist.useList.model.UseListUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UseListService {
    private final UseListMapper mapper;
    private final MonthlyGoalMapper goalMapper;

    public int updUseList(UseListUpdDto dto) {
        goalMapper.updSaveCost(dto);
        return mapper.updUseList(dto);
    }

    public List<UseListMonthVo> selUseListByMonth(String yearMonth) {
        return mapper.selUseListByMonth(yearMonth);
    }

    public List<UseListDailyVo> selUseListByDay(String day) {
        List<UseListDailyVo> list = mapper.selUseListByDay(day);
        for (UseListDailyVo vo : list) {
            vo.setCostCategory(vo.getCostCategoryId() == 1 ? "돈" : "시간");
        }
        return list;
    }
}
