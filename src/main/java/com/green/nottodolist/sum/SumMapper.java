package com.green.nottodolist.sum;

import com.green.nottodolist.sum.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SumMapper {

    MaxSaveMoneyVo selMaxSaveMoney();

    MaxSaveTimeVo selMaxSaveTime();

    int selSumSaveMoney(SumDto dto);

    int selSumSaveTime(SumDto dto);


}
