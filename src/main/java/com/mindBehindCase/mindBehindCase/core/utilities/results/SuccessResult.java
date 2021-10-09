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
public class SuccessResult extends Result {

    public SuccessResult(boolean success) {
        super(success, 200, "Yorumlar Listelenip output.txt Dosyasına yazıldı.");
    }
}
