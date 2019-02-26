package com.tensquare.base.conterller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: tensquare_parent
 * @description: 公共处理异常
 * @author: Ming.Li
 * @create: 2019-02-26 15:50
 **/

@RestControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e){
          return new Result(false,StatusCode.ERROR,e.getMessage());
    }
}
