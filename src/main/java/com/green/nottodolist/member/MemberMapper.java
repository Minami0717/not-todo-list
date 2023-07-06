package com.green.nottodolist.member;

import com.green.nottodolist.member.model.MemberEntity;
import com.green.nottodolist.member.model.MemoUpdDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    String selMemo(int memberId);
    int updMemo(MemoUpdDto dto);
    int insMember(MemberEntity entity);
    String selMember(int memberId);
}
