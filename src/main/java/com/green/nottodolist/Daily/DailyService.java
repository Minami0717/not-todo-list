package com.green.nottodolist.Daily;

import com.green.nottodolist.Daily.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DailyService {
    private final DailyMapper mapper;


    public int pastUpdDaily(DailyUpdDto dto){
        return mapper.pastUpdDaily(dto);
    }
    public int delDaily(DailyDelDto dto){return mapper.delDaily(dto);}
    public List<DailyVo> selDailyAll(DailySelDto dto){

        return mapper.selDailyAll(dto);

    };


}
