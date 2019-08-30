package com.kitchen.demo.enums;

public enum  CollSigEnums implements EnumCode{

    WEISHOUCANG(0,"未收藏"),
    YISHOUCANG(1,"已收藏"),

    ;
    private Integer code;
    private String msg;

    @Override
    public String getMsg() {
        return msg;
    }

    CollSigEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return getMsg();
    }

    @Override
    public Integer getCode() {
        return code;
    }

}
