/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.core.utilities.results;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author oguz.turkaslan
 */
@Getter
@Setter
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

    public Result(T data, boolean success) {
        this.data = data;
        this.success = success;
    }
}
