package com.green.nottodolist.calender;

import com.green.nottodolist.calender.model.CalenderSelDto;
import com.green.nottodolist.calender.model.CalenderSelVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/calender")
@RequiredArgsConstructor
@Tag(name = "달력")
public class CalenderController {
    private final CalenderService service;

    @GetMapping
    @Operation(summary = "이번 달에 실행한 항목 모두 출력", description = "monthYear: YYYY-MM")
    public List<CalenderSelVo> getCalender(@RequestParam String monthYear) {
        CalenderSelDto dto = new CalenderSelDto();
        dto.setMonthYear(monthYear);
        return service.selCalender(dto);
    }
}
