package org.example.gitrepotest;

/**
 * 功能描述 : 响应信息
 *
 * @author zoo 2022-4-27 15:53
 */
public class ActionResult<T> {
    private Integer code;
    private String message;
    private boolean success;
    private T date;

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

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
