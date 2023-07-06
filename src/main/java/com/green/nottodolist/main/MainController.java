package com.green.nottodolist.main;

import com.green.nottodolist.main.model.SaveCostDataVo;
import com.green.nottodolist.member.model.MemberInsDto;
import com.green.nottodolist.member.model.MemoUpdDto;
import com.green.nottodolist.monthlyGoal.model.MonthDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import com.green.nottodolist.useList.model.UseListUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Tag(name = "메인 페이지")
@RequiredArgsConstructor
public class MainController {
    private final MainService service;

    @PatchMapping("/use-cost")
    @Operation(summary = "소비비용 수정", description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값,<br>" +
            "useCost: [int] 소비비용<br>")
    public int patchUseList(@RequestBody UseListUpdDto dto) {
        return service.updUseList(dto);
    }

    @GetMapping("/today-not-todo")
    @Operation(summary = "한달목표금액 누적사용금액 사용금액 ",description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값,<br>" +
            "useCostSum: [int] 누적소비비용<br>" +
            "notTodo: [최대 20자] 소비항목(ex담배,술),<br>"+
            "goalCost:  [int] 목표비용<br>"+
            "monthYear: [최대 7자] 년월(ex 2023-06)<br>")
    public List<MonthlyGoalVo> getTodayGoal() {
        return service.selTodayGoal();
    }

    @GetMapping("/save-data")
    @Operation(summary = "선택 기간별 금액",description = "" +
            "maxSaveMoney: 기간별 최대 절약비용,<br>" +
            "maxSaveTime: 기간별 최대 절약시간<br>" +
            "sumSaveMoney: 지금까지 아낀 비용 ,<br>"+
            "sumSaveTime: 지금까지 아낀 시간<br>")
    public SaveCostDataVo getSaveCostData(MonthDto dto){
        return service.selSaveCostData(dto);
    }

    @GetMapping("/memo")
    @Operation(summary = "메모 출력")
    public String getMemo(int memberId) {
        return service.selMemo(memberId);
    }

    @PatchMapping("/memo")
    @Operation(summary = "메모 수정")
    public int patchMemo(@RequestBody MemoUpdDto dto) {
        return service.updMemo(dto);
    }

    @GetMapping("/member")
    @Operation(summary = "member_id별 닉네임 출력")
    public String getMember(int memberId) {
        return service.selMember(memberId);
    }

    @PostMapping("/member")
    @Operation(summary = "member_id별 닉네임 입력 ")
    public int postMember(@RequestBody MemberInsDto dto) {
        return service.insMember(dto);
    }
}



















