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
    private int errorCode;
    private String message;

    public Result(boolean success, int errorCode, String message) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
    }

    public Result(boolean success) {
        this.success = success;
    }

    public Result(T data, int errorCode, String message) {
        this.data = data;
        this.errorCode = errorCode;
        this.message = message;
    }

    public Result() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
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

    public void setData(T data) {
        this.data = data;
    }

}
