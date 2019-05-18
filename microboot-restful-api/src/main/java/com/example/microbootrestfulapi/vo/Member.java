package com.example.microbootrestfulapi.vo;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    private String mid ;
    private String name ;
    private Integer age ;
    private Double salary ;
    private Date birthday ;
}
