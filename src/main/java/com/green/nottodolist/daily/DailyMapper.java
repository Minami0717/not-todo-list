package com.green.nottodolist.daily;

import com.green.nottodolist.daily.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DailyMapper {
    int delDaily(DailyDelDto dto);

    int updDaily(DailyUpdDto dto);

    List<DailyVo> selDailyAll(DailySelDto dto);

    Integer selDailyUseCost(int useListId);
}
