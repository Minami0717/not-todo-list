package com.green.nottodolist.daily;

import com.green.nottodolist.daily.model.*;
import com.green.nottodolist.monthlyGoal.MonthlyGoalMapper;
import com.green.nottodolist.useList.model.UseListUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DailyService {
    private final DailyMapper mapper;
    private final MonthlyGoalMapper goalMapper;

    public int updDaily(DailyUpdDto dto) {
        Integer useCost = mapper.selDailyUseCost(dto.getUseListId());
        int costDiff = dto.getUseCost() - useCost;

        UseListUpdDto dto1 = new UseListUpdDto();
        dto1.setGoalId(dto.getGoalId());
        dto1.setUseCost(costDiff);
        mapper.updDaily(dto);

        return goalMapper.updSaveCost(dto1);
    }

    public int delDaily(DailyDelDto dto) {
        return mapper.delDaily(dto);
    }

    public List<DailyVo> selDailyAll(DailySelDto dto) {
        List<DailyVo> vo = mapper.selDailyAll(dto);
        for (int i = 0; i < vo.size(); i++) {
            DailyVo vo1 = vo.get(i);
            if (vo1.getCostCategoryId() == 1) {
                vo1.setCostCategory("원");
            } else if (vo1.getCostCategoryId() == 2) {
                vo1.setCostCategory("시간");
            }
        }
        return vo;
    }

}
