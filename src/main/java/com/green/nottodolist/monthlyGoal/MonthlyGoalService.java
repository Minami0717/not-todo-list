package com.green.nottodolist.monthlyGoal;

import com.green.nottodolist.monthlyGoal.model.NotTodoEntity;
import com.green.nottodolist.monthlyGoal.model.*;
import com.green.nottodolist.useList.UseListMapper;
import com.green.nottodolist.useList.model.UseListInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MonthlyGoalService {
    private final MonthlyGoalMapper mapper;
    private final UseListMapper useListMapper;

    public int insMonthlyGoal(MonthlyGoalInsDto dto) {
        NotTodoEntity entity = new NotTodoEntity();
        entity.setName(dto.getNotTodo());
        mapper.insNotTodo(entity);

        MonthlyGoalEntity goalEntity = MonthlyGoalEntity.builder()
                .goalCost(dto.getGoalCost())
                .costCategory("돈".equals(dto.getCostCategory()) ? 1 : 2)
                .monthYear(dto.getMonthYear())
                .notTodoId(entity.getNotTodoId())
                .memberId(dto.getMemberId())
                .build();

        mapper.insMonthlyGoal(goalEntity);

        String[] s = dto.getMonthYear().split("-");
        int inputYear = Integer.parseInt(s[0]);
        int inputMonth = Integer.parseInt(s[1]);

        LocalDate now = LocalDate.now();
        int today = now.getDayOfMonth();

        if (now.getMonthValue() != inputMonth || now.getYear() != inputYear) { today = 1; }

        Calendar c = Calendar.getInstance();
        c.set(inputYear, inputMonth - 1, 1);
        int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        List<UseListInsDto> list = new ArrayList<>();
        for (int i = today; i <= lastDay; i++) {
            UseListInsDto dto1 = new UseListInsDto();
            dto1.setGoalId(goalEntity.getGoalId());
            dto1.setDate(String.format("%d-%d-%d", inputYear, inputMonth, i));
            list.add(dto1);
        }

        return useListMapper.insUseList(list);
    }

    public int updMonthlyGoal(MonthlyGoalUpdDto dto) {
        Integer goalCost = mapper.selGoalCost(dto.getGoalId());
        int costDiff = dto.getGoalCost() - goalCost;

        MonthlyGoalEntity goalEntity = MonthlyGoalEntity.builder()
                .goalCost(dto.getGoalCost())
                .goalId(dto.getGoalId())
                .saveCost(costDiff)
                .build();

        return mapper.updMonthlyGoal(goalEntity);
    }

    public int delMonthlyGoal(int goalId) {
        return mapper.delMonthlyGoal(goalId);
    }

    public List<MonthlyGoalDetailVo> selMonthlyGoalAll(int memberId) {
        List<MonthlyGoalDetailVo> list = mapper.selMonthlyGoalAll(memberId);
        for (MonthlyGoalDetailVo vo : list) {
            vo.setCostCategory(vo.getCostCategoryId() == 1 ? "원" : "시간");
        }
        return list;
    }
}
