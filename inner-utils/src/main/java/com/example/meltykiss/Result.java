package com.example.meltykiss;

import lombok.Data;

import java.text.MessageFormat;
@Data
public class Result<T>{
    private static final long serialVersionUID = 22L;
    private T type;
    // 响应码，返回状态，返回消息，返回数据
    private int code;

    private Boolean state;

    private String message;

    private Object data;

    private long count;

    public Result(){}

    // 成功
    public static Result ok(){
        Result responseUtils = new Result();
        responseUtils.setCode(200);
        responseUtils.setState(true);
        responseUtils.setMessage("成功");
        return responseUtils;
    }

    // 失败
    public static Result error(){
        Result r = new Result();
        r.setCode(201);
        r.setState(false);
        r.setMessage("失败");
        return r;
    }

    public Result count(long count){
        this.setCount(count);
        return this;
    }
    public Result code(int code){
        this.setCode(code);
        return this;
    }

    public Result state(Boolean state){
        this.setState(state);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }
    public Result message(String message, Object... objects){
        this.setMessage(MessageFormat.format(message, objects));
        return this;
    }

    public Result data(Object result){
        this.setData(result);
        return this;
    }
}
