package com.example.microbootrestfulprovider;

import com.example.microbootrestfulprovider.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMemberService {
    @Resource
    private MemberService memberService ;
    @Test
    public void testGetMember() {
        System.out.println(this.memberService.getMember("admin"));
    }
    @Test
    public void testAuth() {
        System.out.println(this.memberService.listAuthByMember("admin"));
    }
}
