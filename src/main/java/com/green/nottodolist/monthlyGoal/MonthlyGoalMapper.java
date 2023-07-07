package com.green.nottodolist.monthlyGoal;

import com.green.nottodolist.main.model.MaxSaveMoneyVo;
import com.green.nottodolist.main.model.MaxSaveTimeVo;
import com.green.nottodolist.monthlyGoal.model.NotTodoEntity;
import com.green.nottodolist.monthlyGoal.model.MonthDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalDetailVo;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalEntity;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import com.green.nottodolist.useList.model.UseListUpdDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MonthlyGoalMapper {
    int insMonthlyGoal(MonthlyGoalEntity entity);

    int updMonthlyGoal(MonthlyGoalEntity entity);

    int insNotTodo(NotTodoEntity entity);

    List<MonthlyGoalVo> selMonthlyGoal(int memberId);
    List<MonthlyGoalDetailVo> selMonthlyGoalAll(int memberId);

    int delMonthlyGoal(int goalId);

    MaxSaveMoneyVo selMaxSaveMoney(int memberId);

    MaxSaveTimeVo selMaxSaveTime(int memberId);

    String selSumSaveMoney(MonthDto dto);

    String selSumSaveTime(MonthDto dto);

    int updSaveCost(UseListUpdDto dto);

    Integer selGoalCost(int goalId);
}
