package com.green.nottodolist.Sum;

import com.example.demo.Sum.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SumMapper {

    MaxSaveMoneyVo selMaxSaveMoney();

    MaxSaveTimeVo selMaxSaveTime();

    int selSumSaveMoney(SumDto dto);

    int selSumSaveTime(SumDto dto);


}
