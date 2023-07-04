package com.green.nottodolist.useList;

import com.green.nottodolist.useList.model.UseListUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/use-list")
@RequiredArgsConstructor
@Tag(name = "소비비용 입력창")
public class UseListController {
    private final UseListService service;

    @PatchMapping
    @Operation(summary = "소비비용 수정", description = "" +
            "goalId: [int] t_montly_goal 테이블 pk값,<br>" +
            "useCost: [int] 소비비용<br>")
    public int patchUseList(@RequestBody UseListUpdDto dto) {
        return service.updUseList(dto);
    }
}
