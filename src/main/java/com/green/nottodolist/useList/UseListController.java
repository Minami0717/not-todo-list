package com.green.nottodolist.useList;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/use-list")
@RequiredArgsConstructor
public class UseListController {
    private final UseListService service;

//    @PostMapping
//    public int postUseList(@RequestBody List<UseListInsDto> dto) {
//        return service.insUseList(dto);
//    }
}
