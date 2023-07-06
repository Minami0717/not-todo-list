package com.green.nottodolist.useList;


import com.green.nottodolist.useList.model.UseListInsDto;
import com.green.nottodolist.useList.model.UseListUpdDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UseListMapper {
    int insUseList(List<UseListInsDto> dto);
    int updUseList(UseListUpdDto dto);

}
