package com.green.nottodolist.calender;

import com.green.nottodolist.calender.model.CalenderSelDto;
import com.green.nottodolist.calender.model.CalenderSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalenderService {
    private final CalenderMapper mapper;

    public List<CalenderSelVo> selCalender(CalenderSelDto dto) {
        return mapper.selCalender(dto);
    }

}
