package com.green.nottodolist.monthlyGoal;

import com.green.nottodolist.main.model.NotTodoEntity;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalEntity;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalInsDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalUpdDto;
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
        Integer notTodoId = mapper.selNotTodoId(dto.getNotTodo());
        if (notTodoId == null) {
            NotTodoEntity entity = new NotTodoEntity();
            entity.setName(dto.getNotTodo());
            mapper.insNotTodo(entity);
            notTodoId = entity.getNotTodoId();
        }

        int costCategory = 1;
        int goalCost = dto.getGoalCost();

        if ("시간".equals(dto.getCostCategory())) {
//            String[] s = dto.getMonthYear().split("-");
//            Calendar c = Calendar.getInstance();
//            c.set(Integer.parseInt(s[0]), Integer.parseInt(s[1]) - 1, 1);
//            int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//            goalCost = goalCost * lastDay;
            costCategory = 2;
        }

        MonthlyGoalEntity goalEntity = MonthlyGoalEntity.builder()
                .goalCost(goalCost)
                .costCategory(costCategory)
                .monthYear(dto.getMonthYear())
                .notTodoId(notTodoId)
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
        Integer notTodoId = mapper.selNotTodoId(dto.getNotTodo());
        if (notTodoId == null) {
            NotTodoEntity entity = new NotTodoEntity();
            entity.setName(dto.getNotTodo());
            mapper.insNotTodo(entity);
            notTodoId = entity.getNotTodoId();
        }

        MonthlyGoalEntity goalEntity = MonthlyGoalEntity.builder()
                .goalCost(dto.getGoalCost())
                .costCategory("돈".equals(dto.getCostCategory()) ? 1 : 2)
                .notTodoId(notTodoId)
                .goalId(dto.getGoalId())
                .build();

        return mapper.updMonthlyGoal(goalEntity);
    }

    public int delMonthlyGoal(int goalId) {
        return mapper.delMonthlyGoal(goalId);
    }
}
