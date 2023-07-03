package com.green.nottodolist.memo;

import com.example.nottodolisttest.memo.model.MemoDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    String selMemo();
    int updMemo(MemoDto dto);
}
