package vko.cn.myapplication.module.bean;


import java.io.Serializable;

/**
 * Created by A on 2017/9/4.
 */

public class BaseEntity<E> implements Serializable {
    private int code;
    private String msg;
    private E data;

    public boolean isSuccess() {
        return code == 0;
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

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

}
