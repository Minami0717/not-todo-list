package com.green.nottodolist.sum;

import com.green.nottodolist.sum.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SumService {
    private final SumMapper mapper;

    public SumVo Sum(SumDto dto){
        MaxSaveMoneyVo vo = mapper.selMaxSaveMoney();
        MaxSaveTimeVo vo1 = mapper.selMaxSaveTime();



        return SumVo.builder()
                .sumSaveMoney(mapper.selSumSaveMoney(dto))
                .sumSaveTime(mapper.selSumSaveTime(dto))
                .maxSaveMoney(vo)
                .maxSaveTime(vo1)
                .build();

    }


}
