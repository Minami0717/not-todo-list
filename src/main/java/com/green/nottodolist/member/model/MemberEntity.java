package com.green.nottodolist.member.model;

import lombok.Data;

@Data
public class MemberEntity {
    private int memberId;
    private String nickname;
    private String memo;
}
