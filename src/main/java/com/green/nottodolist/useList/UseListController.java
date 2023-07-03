package com.green.nottodolist.useList;

import com.example.nottodolisttest.useList.model.UseListUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/use-list")
@RequiredArgsConstructor
public class UseListController {
    private final UseListService service;

    @PatchMapping
    public int patchUseList(@RequestBody UseListUpdDto dto) {
        return service.updUseList(dto);
    }
}
