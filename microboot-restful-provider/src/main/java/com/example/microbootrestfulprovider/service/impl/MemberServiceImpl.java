package com.example.microbootrestfulprovider.service.impl;

import com.example.microbootrestfulapi.vo.Member;
import com.example.microbootrestfulprovider.mapper.ActionMapper;
import com.example.microbootrestfulprovider.mapper.MemberMapper;
import com.example.microbootrestfulprovider.mapper.RoleMapper;
import com.example.microbootrestfulprovider.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private ActionMapper actionMapper;



    @Override
    public Member getMember(String mid) {
        return memberMapper.getMember(mid);
    }

    @Override
    public Map<String, Set<String>> listAuthByMember(String mid) {
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        map.put("allRoles",roleMapper.listRole(mid));
        map.put("allActions", this.actionMapper.listAction(mid));
        return map;
    }
}
