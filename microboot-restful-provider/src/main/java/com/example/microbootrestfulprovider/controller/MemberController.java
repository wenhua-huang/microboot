package com.example.microbootrestfulprovider.controller;

import com.example.microbootrestfulapi.vo.Member;
import com.example.microbootrestfulprovider.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping(value = "/member/get")
    public Member get(String mid) {

        return  memberService.getMember(mid);
    }

    @GetMapping(value="/member/auth")
    public Object auth(String mid) {
        return this.memberService.listAuthByMember(mid) ;
    }


}
