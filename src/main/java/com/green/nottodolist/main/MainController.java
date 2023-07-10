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
@Tag(name = "1. 메인 페이지")
@RequiredArgsConstructor
public class MainController {
    private final MainService service;

    @PatchMapping("/today-not-todo")
    @Operation(summary = "소비비용 추가", description = "" +
            "goalId: [int] 수정할 목표 id값<br>"+
            "useCost: [int] 소비비용<br>")
    public int patchUseList(@RequestBody UseListUpdDto dto) {
        return service.updUseList(dto);
    }

    @GetMapping("/today-not-todo")
    @Operation(summary = "이번달 목표 조회",description = ""+
            "goalId: 조회한 목표 id값<br>"+
            "notTodo: 소비항목(ex 담배, 술)<br>"+
            "goalCost: 목표비용<br>"+
            "useCostSum: 누적소비비용<br>"+
            "costCategory: 비용구분(돈, 시간)<br>"+
            "costCategoryId: 비용구분 id값")
    public List<MonthlyGoalVo> getTodayGoal(int memberId) {
        return service.selTodayGoal(memberId);
    }

    @GetMapping("/save-data")
    @Operation(summary = "선택 기간별 금액",description = "" +
            "memberId: 사용자구분 id값<br>"+
            "startMonth: 기간별 비용 조회시 필요한 시작년월(ex 2023-07)<br>"+
            "endMonth: 기간별 비용 조회시 필요한 마지막년월(ex 2023-10)<br><br>"+
            "maxSaveMoney: 기간별 최대 절약한 비용<br>"+
            "maxSaveTime: 기간별 최대 절약한 시간<br>"+
            "sumSaveMoney: 지금까지 절약한 비용합계<br>"+
            "sumSaveTime: 지금까지 절약한 시간합계<br>")
    public SaveCostDataVo getSaveCostData(MonthDto dto){
        return service.selSaveCostData(dto);
    }

    @GetMapping("/memo")
    @Operation(summary = "한줄 메모 조회")
    public String getMemo(int memberId) {
        return service.selMemo(memberId);
    }

    @PatchMapping("/memo")
    @Operation(summary = "한줄 메모 수정")
    public int patchMemo(@RequestBody MemoUpdDto dto) {
        return service.updMemo(dto);
    }

    @GetMapping("/member")
    @Operation(summary = "회원 닉네임 조회")
    public String getMember(int memberId) {
        return service.selMember(memberId);
    }

    @PostMapping("/member")
    @Operation(summary = "회원 등록, 이미 있는 회원인 경우 로그인")
    public int postMember(@RequestBody MemberInsDto dto) {
        return service.insMember(dto);
    }
}



















