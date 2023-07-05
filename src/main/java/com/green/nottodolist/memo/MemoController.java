package com.green.nottodolist.memo;

import com.green.nottodolist.memo.model.MemoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/memo")
@RequiredArgsConstructor
@Tag(name = "메모")
public class MemoController {
    private final MemoService service;

    @PutMapping
    @Operation(summary = "한줄 메모 수정", description = "" +
            "memo: [최대 30자] 한줄 메모  ,<br>")
    public int putMemo(@RequestBody MemoDto dto) {
        return service.updMemo(dto);
    }

//    @GetMapping
//    public String getMemo() {
//
//    }
}
