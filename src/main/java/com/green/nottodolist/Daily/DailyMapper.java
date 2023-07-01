package com.green.nottodolist.Daily;

import com.example.nottodolisttest.Daily.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DailyMapper {

    int delDaily(DailyDelDto dto);
    int UpdDaily(DailyUpdDto dto);
    List<DailyVo> selDailyAll(DailySelDto dto);
}
