package com.example.microbootrestfulprovider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Set;



@Mapper
public interface ActionMapper {
    Set<String> listAction(@Param("mid") String mid);
}
