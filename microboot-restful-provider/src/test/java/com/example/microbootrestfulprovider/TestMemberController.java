package com.example.microbootrestfulprovider;

import com.example.microbootrestfulapi.vo.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMemberController {
    private RestTemplate restTemplate = new RestTemplate() ;
    @Test
    public void testGet() {
        String url = "http://localhost:8090/member/get?mid=admin" ;
        Member vo = this.restTemplate.getForObject(url, Member.class ) ;
        System.out.println(vo);
    }
    @SuppressWarnings("unchecked")
    @Test
    public void testAuth() {
        String url = "http://localhost:8090/member/auth?mid=admin" ;
        Map<String,Object> map = this.restTemplate.getForObject(url, Map.class ) ;
        Set<String> allRoles = new HashSet<String>() ;
        Set<String> allActions = new HashSet<String>() ;
        allRoles.addAll((List<String>) map.get("allRoles"));
        allActions.addAll((List<String>) map.get("allActions")) ;
        System.out.println("【角色】" + allRoles);
        System.out.println("【权限】" + allActions);
    }
}
