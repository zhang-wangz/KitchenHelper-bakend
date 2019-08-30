package com.kitchen.demo.util;


import com.kitchen.demo.vo.ResultVO;

public class ResultUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg("success");
        resultVO.setCode(0);
        resultVO.setDataObj(object);
        return  resultVO;
    }


    public static ResultVO success(){
        return null;
    }

    public static  ResultVO error(Integer code,String msg){
        ResultVO  resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
