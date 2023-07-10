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
@Tag(name = "3. 달력 페이지")
public class CalenderController {
    private final CalenderService service;

    @GetMapping
    @Operation(summary = "선택한 달의 실행한 항목 모두 조회", description =
            "memberId: 회원 id값<br>" +
            "monthYear: YYYY-MM<br>")
    public List<CalenderSelVo> getCalender(CalenderSelDto dto) {
        return service.selCalender(dto);
    }
}
