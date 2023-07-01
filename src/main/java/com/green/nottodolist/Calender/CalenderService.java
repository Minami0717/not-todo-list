package com.green.nottodolist.Calender;

import com.example.nottodolisttest.Calender.model.CalenderSelDto;
import com.example.nottodolisttest.Calender.model.CalenderSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalenderService {
    private final CalenderMapper mapper;


    public List<CalenderSelVo> selCalender(CalenderSelDto dto){
     return mapper.selCalender(dto);
    }

}
