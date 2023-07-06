package com.green.nottodolist.member;

import com.green.nottodolist.member.model.MemberEntity;
import com.green.nottodolist.member.model.MemberInsDto;
import com.green.nottodolist.member.model.MemoUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper mapper;

    public int insMember(MemberInsDto dto) {
        MemberEntity entity = new MemberEntity();
        entity.setNickname(dto.getNickname());
        mapper.insMember(entity);

        return entity.getMemberId();
    }

    public String selMember(int memberId) {
        return mapper.selMember(memberId);
    }

    public String selMemo(int memberId) {
        return mapper.selMemo(memberId);
    }

    public int updMemo(MemoUpdDto dto) {
        return mapper.updMemo(dto);
    }
}
