package entity;

import java.util.Collection;

/**
 * @program: tensquare_parent
 * @description: 返回结果实体类
 * @author: Ming.Li
 * @create: 2019-01-07 15:26
 **/
public class Result {
    private boolean falg;//是否成功
    private Integer code;//返回码
    private String message;//返回信息
    private Object data;//返回数据

    public Result(boolean flag, Integer code, String message, Object
            data) {
        super();
        this.falg = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public Result() {
    }
    public Result(boolean flag, Integer code, String message) {
        super();
        this.falg = flag;
        this.code = code;
        this.message = message;
    }

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
