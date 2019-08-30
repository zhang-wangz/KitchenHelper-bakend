package com.kitchen.demo.enums;

public enum BrowSigEnums implements EnumCode{
    WEILIULAN(0,"未浏览"),
    YILIULAN(1,"已浏览"),

    ;

    private Integer code;
    private String msg;

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return getMsg();
    }

    @Override
    public Integer getCode() {
        return code;
    }



    BrowSigEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
