package com.green.nottodolist.memo;

import com.green.nottodolist.memo.model.MemoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoService {
    private final MemoMapper mapper;

    @Autowired
    public MemoService(MemoMapper mapper) {
        this.mapper = mapper;
    }

    public int updMemo(MemoDto dto) {
        return mapper.updMemo(dto);
    }
}
