package com.green.nottodolist.main;


import com.green.nottodolist.calender.model.CalenderSelDto;
import com.green.nottodolist.calender.model.CalenderSelVo;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalDetailVo;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalInsDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalUpdDto;
import com.green.nottodolist.sum.model.SumDto;
import com.green.nottodolist.sum.model.SumVo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MainController {
        private final MainService service;


    @GetMapping
    public SumVo getSum(SumDto dto){
        return ;
    }

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

    @GetMapping
    @Operation(summary = "누적목표 조회")
    public List<MonthlyGoalDetailVo> getMonthlyGoal() {
        return service.selMonthlyGoalAll();
    }

    @GetMapping
    @Operation(summary = "이번 달에 실행한 항목 모두 출력", description = "monthYear: YYYY-MM")
    public List<CalenderSelVo> getCalender(@RequestParam String monthYear) {
        CalenderSelDto dto = new CalenderSelDto();
        dto.setMonthYear(monthYear);
        return service.selCalender(dto);
    }
}
