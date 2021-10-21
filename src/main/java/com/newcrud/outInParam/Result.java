package com.newcrud.outInParam;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;
    public static Result succ(Object object){
        Result result=new Result();
        result.setCode("200");
        result.setMsg("ok");
        result.setData(object);
        return result;
    }
    public static Result fail(Object object,String string){
        Result result=new Result();
        result.setData(object);
        result.setCode("100");
        //我们这次不将msg写死了，而是通过入参来填写，当然succ静态方法也可以这么写
        result.setMsg(string);
        return result;
    }
}
