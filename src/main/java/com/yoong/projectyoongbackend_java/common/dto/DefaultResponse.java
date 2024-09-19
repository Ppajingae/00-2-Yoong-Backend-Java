package com.yoong.projectyoongbackend_java.common.dto;

import lombok.Builder;

public class DefaultResponse {

    private String msg;

    public DefaultResponse from(String msg){

        DefaultResponse defaultResponse = new DefaultResponse();

        defaultResponse.msg = msg;

        return defaultResponse;
    }
}

