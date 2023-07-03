package com.green.nottodolist.main;

import com.green.nottodolist.main.model.MainPageDto;
import com.green.nottodolist.main.model.MainPageVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")
@RequiredArgsConstructor
@Tag(name = "선택기간별 최고기록")
public class MainController {
    private final MainService service;

    @GetMapping
    @Operation(summary = "기간별 아낀 금액", description = "" +
            "startMonth: [최대 7자] 첫째달 <br>" +
            "endMonth: [최대 7자] 마지막달<br>")
    public MainPageVo getMainData(MainPageDto dto) {
        return service.getMainData(dto);
    }
}
