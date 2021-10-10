/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.business.concretes;

import com.mindBehindCase.mindBehindCase.core.utilities.results.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oguz_
 */
public class CommentsManagerTest {

    @Test
    public void testGetComments() {
        System.out.println("getComments");
        CommentsManager instance = null;
        Result expResult = new Result(false);
        Result result = instance.getComments();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
