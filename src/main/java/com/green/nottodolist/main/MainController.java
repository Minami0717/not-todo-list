package com.green.nottodolist.main;

import com.green.nottodolist.Today.TodayService;
import com.green.nottodolist.member.MemberService;
import com.green.nottodolist.member.model.MemberInsDto;
import com.green.nottodolist.member.model.MemoUpdDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import com.green.nottodolist.sum.SumService;
import com.green.nottodolist.sum.model.SumDto;
import com.green.nottodolist.sum.model.SumVo;
import com.green.nottodolist.useList.model.UseListUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/main")
@Tag(name = "메인 페이지")
public class MainController {
    public final TodayService service;

    private final SumService service2;
    private final MemberService service3;

    @Autowired
    public MainController(TodayService service, SumService service2, MemberService service3) {
        this.service = service;
        this.service2 = service2;
        this.service3 = service3;
    }

    @PatchMapping("/usecost")
    @Operation(summary = "소비비용 수정", description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값,<br>" +
            "useCost: [int] 소비비용<br>")
    public int patchUseList(@RequestBody UseListUpdDto dto) {
        return service.updUseList(dto);
    }

    @GetMapping("/todaygoal")
    @Operation(summary = "한달목표금액 누적사용금액 사용금액 ",description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값,<br>" +
            "useCostSum: [int] 누적소비비용<br>" +
            "notTodo: [최대 20자] 소비항목(ex담배,술),<br>"+
            "goalCost:  [int] 목표비용<br>"+
            "monthYear: [최대 7자] 년월(ex 2023-06)<br>")
    public List<MonthlyGoalVo> getTodayGoal() {
        return service.selTodayGoal();
    }

    @GetMapping("/sum")
    @Operation(summary = "선택 기간별 금액",description = "" +
            "maxSaveMoney: 기간별 최대 절약비용,<br>" +
            "maxSaveTime: 기간별 최대 절약시간<br>" +
            "sumSaveMoney: 지금까지 아낀 비용 ,<br>"+
            "sumSaveTime: 지금까지 아낀 시간<br>")
    public SumVo getSum(SumDto dto){
        return service2.Sum(dto);
    }

    @GetMapping("/memo")
    @Operation(summary = "메모 출력")
    public String getMemo(int memberId) {
        return service3.selMemo(memberId);
    }

    @PatchMapping("/memo")
    @Operation(summary = "메모 수정")
    public int patchMemo(@RequestBody MemoUpdDto dto) {
        return service3.updMemo(dto);
    }

    @GetMapping("/member")
    @Operation(summary = "member_id별 닉네임 출력")
    public String getMember(int memberId) {
        return service3.selMember(memberId);
    }

    @PostMapping("/member")
    @Operation(summary = "member_id별 닉네임 입력 ")
    public int postMember(@RequestBody MemberInsDto dto) {
        return service3.insMember(dto);
    }


}



















