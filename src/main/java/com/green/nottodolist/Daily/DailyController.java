package com.green.nottodolist.Daily;


import com.green.nottodolist.Daily.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DailyController {
    private final DailyService service;

    @PutMapping("/patch")
    public int PatchDaily(@RequestBody DailyUpdDto dto){return service.pastUpdDaily(dto);}

    @GetMapping
    public List<DailyVo> getAllDaily(@RequestParam String date){
        DailySelDto dto =new DailySelDto();
        dto.setDate(date);
        return service.selDailyAll(dto);
    }

    @DeleteMapping
    public int delDaily(@RequestParam int useListId){
        DailyDelDto dto = new DailyDelDto();
        dto.setUseListId(useListId);
        return service.delDaily(dto);
    }


}
