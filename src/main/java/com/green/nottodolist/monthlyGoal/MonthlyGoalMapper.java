package com.green.nottodolist.monthlyGoal;

import com.green.nottodolist.monthlyGoal.model.MonthDto;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalEntity;
import com.green.nottodolist.monthlyGoal.model.MonthlyGoalVo;
import com.green.nottodolist.notTodo.model.MaxSaveMoneyVo;
import com.green.nottodolist.notTodo.model.MaxSaveTimeVo;
import com.green.nottodolist.notTodo.model.NotTodoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MonthlyGoalMapper {
    int insMonthlyGoal(MonthlyGoalEntity entity);
    int updMonthlyGoal(MonthlyGoalEntity entity);
    int insNotTodo(NotTodoEntity entity);
    List<MonthlyGoalVo> selMonthlyGoal(String monthYear);
    Integer selNotTodoId(String name);
    int delMonthlyGoal(int goalId);
    MaxSaveMoneyVo selMaxSaveMoney();
    MaxSaveTimeVo selMaxSaveTime();
    int selSumSaveMoney(MonthDto dto);
    int selSumSaveTime(MonthDto dto);
}
