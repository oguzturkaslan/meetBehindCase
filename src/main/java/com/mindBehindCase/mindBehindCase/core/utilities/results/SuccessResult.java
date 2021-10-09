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
public class SuccessResult<T> extends Result<T> {

    public SuccessResult(T data, boolean success, String errorCode, String message) {
        super(data, true, errorCode, message);
    }

    public SuccessResult(T data, boolean success) {
        super(data, success);
    }

}
