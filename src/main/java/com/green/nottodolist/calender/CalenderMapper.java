package com.green.nottodolist.calender;

import com.green.nottodolist.calender.model.CalenderSelDto;
import com.green.nottodolist.calender.model.CalenderSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalenderMapper {
    List<CalenderSelVo> selCalender(CalenderSelDto dto);
}
