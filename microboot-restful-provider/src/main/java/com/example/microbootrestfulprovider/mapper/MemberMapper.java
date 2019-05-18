package com.example.microbootrestfulprovider.mapper;

import com.example.microbootrestfulapi.vo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

    Member getMember(@Param("mid") String mid);

}
