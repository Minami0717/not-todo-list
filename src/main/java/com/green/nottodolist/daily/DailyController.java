package com.green.nottodolist.daily;


import com.green.nottodolist.daily.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/daily")
@RequiredArgsConstructor
@Tag(name = "상세페이지")
public class DailyController {
    private final DailyService service;

    @PutMapping
    @Operation(summary = "입력값 수정", description = "useListId: PK값,<br>" + "cost: 소비비용, <br>" + "cost값이 0일 경우 삭제처리와 같음")
    public int PatchDaily(@RequestBody DailyUpdDto dto) {
        return service.updDaily(dto);
    }

    @GetMapping
    @Operation(summary = "그 날의 전체 항목 행위를 했든 안했든 모든 항목들을 출력", description = "date = YYYY-MM-DD")
    public List<DailyVo> getAllDaily(@RequestParam String date) {
        DailySelDto dto = new DailySelDto();
        dto.setDate(date);
        return service.selDailyAll(dto);
    }

    @DeleteMapping
    @Operation(summary = "입력한 값 삭제", description = "useListId: PK값")
    public int delDaily(@RequestParam int useListId) {
        DailyDelDto dto = new DailyDelDto();
        dto.setUseListId(useListId);
        return service.delDaily(dto);
    }
}
