package com.green.nottodolist.monthlyGoal;

import com.green.nottodolist.monthlyGoal.model.MonthlyGoalInsDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/monthly-goal")
@RequiredArgsConstructor
public class MonthlyGoalController {
    private final MonthlyGoalService service;

    @PostMapping
    @Operation(summary = "한달목표 입력", description = "" +
            "notTodo: [최대 20자] 소비항목(ex담배,술)<br>" +
            "costCategory: 비용구분(돈, 시간)<br>" +
            "goalCost: [int] 목표비용,<br>" +
            "monthYear: [최대 7자] 년월(ex 2023-06)<br>")
    public int postMonthlyGoal(@RequestBody MonthlyGoalInsDto dto) {
        return service.insMonthlyGoal(dto);
    }

    @PutMapping
    @Operation(summary = "한달목표 수정", description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값 ,<br>" +
            "notTodo: [최대 20자] 소비항목(ex담배,술),<br>" +
            "costCategory: 비용구분(돈, 시간),<br>" +
            "goalCost:  [int] 목표비용<br>")
    public int putMonthlyGoal(@RequestBody MonthlyGoalUpdDto dto) {
        return service.updMonthlyGoal(dto);
    }

    @DeleteMapping
    @Operation(summary = "한달목표 삭제", description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값  ,<br>")
    public int delMonthlyGoal(@RequestParam int goalId) {
        return service.delMonthlyGoal(goalId);
    }
}
