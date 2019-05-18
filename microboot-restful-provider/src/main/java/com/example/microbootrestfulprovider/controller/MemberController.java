package com.example.microbootrestfulprovider.controller;

import com.example.microbootrestfulapi.vo.Member;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MemberController {

    @RequestMapping(value = "/member/add")
    public Object add(@RequestBody Member member) {    // 表示当前的配置可以直接将参数变为VO对象
        System.err.println("【MemberController.add()接收对象】" + member);
        return true;
    }
    @RequestMapping(value = "/member/get")
    public Member get(long mid) {
        Member vo = new Member();
        vo.setMid(mid);
        vo.setName("studyjava - " + mid);
        vo.setBirthday(new Date());
        vo.setSalary(99999.99);
        vo.setAge(16);
        return vo;
    }

}
