package com.green.nottodolist.Daily;

import com.example.nottodolisttest.Daily.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DailyService {
    private final DailyMapper mapper;


    public int UpdDaily(DailyUpdDto dto){
        return mapper.UpdDaily(dto);
    }
    public int delDaily(DailyDelDto dto){return mapper.delDaily(dto);}
    public List<DailyVo> selDailyAll(DailySelDto dto){
       List<DailyVo> vo = mapper.selDailyAll(dto);
        for (int i = 0; i < vo.size(); i++) {
            DailyVo vo1 = vo.get(i);
            if ( vo1.getCostCategoryId()== 1) {
                vo1.setCostCategory("돈");
            } else if (vo1.getCostCategoryId()==2) {
                vo1.setCostCategory("시간");
            }
        }
        return vo;
    };


}
