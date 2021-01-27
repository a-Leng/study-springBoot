package com.example.demo3.util.response;

public enum ResponseCode {
    SUCCESS(200,"操作成功"),
    FAILED(1001,"操作失败"),
    ERROR(5000,"未知错误");

    private int code;
    private String msg;
    ResponseCode(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
