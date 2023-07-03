package com.green.nottodolist.monthlyGoal;

import com.example.nottodolisttest.main.model.MaxSaveMoneyVo;
import com.example.nottodolisttest.main.model.MaxSaveTimeVo;
import com.example.nottodolisttest.main.model.NotTodoEntity;
import com.example.nottodolisttest.monthlyGoal.model.MonthDto;
import com.example.nottodolisttest.monthlyGoal.model.MonthlyGoalEntity;
import com.example.nottodolisttest.monthlyGoal.model.MonthlyGoalVo;
import com.example.nottodolisttest.useList.model.UseListUpdDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MonthlyGoalMapper {
    int insMonthlyGoal(MonthlyGoalEntity entity);
    int updMonthlyGoal(MonthlyGoalEntity entity);
    int insNotTodo(NotTodoEntity entity);
    List<MonthlyGoalVo> selMonthlyGoal();
    Integer selNotTodoId(String name);
    int delMonthlyGoal(int goalId);
    MaxSaveMoneyVo selMaxSaveMoney();
    MaxSaveTimeVo selMaxSaveTime();
    int selSumSaveMoney(MonthDto dto);
    int selSumSaveTime(MonthDto dto);
    int updSaveCost(UseListUpdDto dto);
}
