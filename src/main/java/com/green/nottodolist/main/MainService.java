package com.green.nottodolist.main;

import com.green.nottodolist.main.model.SaveCostDataVo;
import com.green.nottodolist.member.MemberMapper;
import com.green.nottodolist.member.model.MemberEntity;
import com.green.nottodolist.member.model.MemberInsDto;
import com.green.nottodolist.member.model.MemoUpdDto;
import com.green.nottodolist.monthlyGoal.MonthlyGoalMapper;
import com.green.nottodolist.monthlyGoal.model.MonthDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import com.green.nottodolist.useList.UseListMapper;
import com.green.nottodolist.useList.model.UseListUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    private final UseListMapper useListMapper;
    private final MonthlyGoalMapper monthlyGoalMapper;
    private final MemberMapper memberMapper;

    public int updUseList(UseListUpdDto dto) {
        monthlyGoalMapper.updSaveCost(dto);
        return useListMapper.updUseList(dto);
    }

    public List<MonthlyGoalVo> selTodayGoal(int memberId){
        List<MonthlyGoalVo> list = monthlyGoalMapper.selMonthlyGoal(memberId);
        for (MonthlyGoalVo vo : list) {
            vo.setCostCategory(vo.getCostCategoryId() == 1 ? "원" : "시간");
        }
        return list;
    }

    public SaveCostDataVo selSaveCostData(MonthDto dto){
        return new SaveCostDataVo(
                monthlyGoalMapper.selMaxSaveMoney(dto.getMemberId()),
                monthlyGoalMapper.selMaxSaveTime(dto.getMemberId()),
                monthlyGoalMapper.selSumSaveMoney(dto),
                monthlyGoalMapper.selSumSaveTime(dto));
    }

    public int insMember(MemberInsDto dto) {
        MemberEntity entity = new MemberEntity();
        entity.setNickname(dto.getNickname());
        memberMapper.insMember(entity);

        return entity.getMemberId();
    }

    public String selMember(int memberId) {
        return memberMapper.selMember(memberId);
    }

    public String selMemo(int memberId) {
        return memberMapper.selMemo(memberId);
    }

    public int updMemo(MemoUpdDto dto) {
        return memberMapper.updMemo(dto);
    }
}
