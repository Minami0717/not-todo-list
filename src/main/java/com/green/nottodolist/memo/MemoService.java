package com.green.nottodolist.memo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoService {
    private final MemoMapper mapper;

    @Autowired
    public MemoService(MemoMapper mapper) {
        this.mapper = mapper;
    }

    public String selMemo() {
        return mapper.selMemo();
    }

    public int updMemo(String memo) {
        return mapper.updMemo(memo);
    }
}
