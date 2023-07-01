package com.green.nottodolist.Calender;

import com.green.nottodolist.Calender.model.CalenderSelDto;
import com.green.nottodolist.Calender.model.CalenderSelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalenderMapper {
    List<CalenderSelVo> selCalender(CalenderSelDto dto);


}
