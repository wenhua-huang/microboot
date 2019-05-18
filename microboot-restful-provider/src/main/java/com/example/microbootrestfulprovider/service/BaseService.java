package com.example.microbootrestfulprovider.service;

import org.springframework.context.MessageSource;

import javax.annotation.Resource;
import java.util.Locale;

public abstract class BaseService {

    @Resource
    private MessageSource messageSource;

    public String getMessage(String key, String... args) {
        return this.messageSource.getMessage(key, args, Locale.getDefault());
    }

}
