package com.green.nottodolist.sum;

import com.green.nottodolist.sum.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SumMapper {

    MaxSaveMoneyVo selMaxSaveMoney();

    MaxSaveTimeVo selMaxSaveTime();

    String selSumSaveMoney(SumDto dto);

    String selSumSaveTime(SumDto dto);


}
