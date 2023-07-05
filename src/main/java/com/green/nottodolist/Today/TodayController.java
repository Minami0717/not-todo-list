package com.green.nottodolist.Today;

import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import com.green.nottodolist.useList.model.UseListUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/today")
public class TodayController {

    public final TodayService service;

    @Autowired
    public TodayController(TodayService service){
        this.service = service;
    }

    @PatchMapping
    @Operation(summary = "소비비용 수정", description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값,<br>" +
            "useCost: [int] 소비비용<br>")
    public int patchUseList(@RequestBody UseListUpdDto dto) {
        return service.updUseList(dto);
    }

    @GetMapping
    @Operation(summary = "누적목표 조회")
    public List<MonthlyGoalVo> getTodayGoal() {
        return service.selTodayGoal();
    }









}
