package com.green.nottodolist.memo;

import com.green.nottodolist.memo.model.MemoDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    String selMemo();
    int updMemo(MemoDto dto);
}
