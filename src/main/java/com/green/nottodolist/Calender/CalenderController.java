package com.green.nottodolist.Calender;

import com.green.nottodolist.Calender.model.CalenderSelDto;
import com.green.nottodolist.Calender.model.CalenderSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calender")
@RequiredArgsConstructor
public class CalenderController {
    private final CalenderService service;


    @GetMapping
    public List<CalenderSelVo> getCalender(@RequestParam String monthYear ){
        CalenderSelDto dto = new CalenderSelDto();
        dto.setMonthYear(monthYear);
        return service.selCalender(dto);
    }
}
