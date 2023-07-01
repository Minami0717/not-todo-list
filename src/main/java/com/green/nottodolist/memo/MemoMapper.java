package com.green.nottodolist.memo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    String selMemo();
    int updMemo(String memo);
}
