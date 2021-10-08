/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.model;

import lombok.Data;

/**
 *
 * @author oguz.turkaslan
 */
@Data
public class Comments {

    private int id;
    private String body;
    private int postId;
}
