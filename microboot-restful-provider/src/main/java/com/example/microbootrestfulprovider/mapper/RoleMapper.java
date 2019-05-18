package com.example.microbootrestfulprovider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

@Mapper
public interface RoleMapper {
    Set<String> listRole(@Param("memberId") String memberId);
}
