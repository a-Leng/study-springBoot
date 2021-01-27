package com.example.demo3.util.response;

import lombok.Data;

@Data
public class ResponseMsg<T> {
    private int code;

    private String msg;
    private T data;
    public ResponseMsg(T data){
        this(ResponseCode.SUCCESS,data);
    }
    public  ResponseMsg(){}
    public ResponseMsg(ResponseCode responseCode,T data){
        this.code=responseCode.getCode();
    }
}
