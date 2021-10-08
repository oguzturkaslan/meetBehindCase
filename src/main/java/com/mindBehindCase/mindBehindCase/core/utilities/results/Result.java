/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.core.utilities.results;

/**
 *
 * @author oguz.turkaslan
 */
public class Result<T> {

    private T data;
    private boolean success;
    private String errorCode;
    private String message;

    public Result(T data, boolean success, String errorCode, String message) {
        this.data = data;
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
    }

    /*public Result(boolean success, String errorCode, String message) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
    }*/
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

}
