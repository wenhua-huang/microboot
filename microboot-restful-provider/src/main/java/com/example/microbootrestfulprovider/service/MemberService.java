package com.example.microbootrestfulprovider.service;

import com.example.microbootrestfulapi.vo.Member;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.Set;

public interface MemberService {
     Member getMember(@Param("mid") String mid) ;
     Map<String,Set<String>> listAuthByMember(@Param("mid") String mid) ;
}
