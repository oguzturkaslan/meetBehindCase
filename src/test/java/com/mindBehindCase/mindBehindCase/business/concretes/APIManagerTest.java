package com.mindBehindCase.mindBehindCase.business.concretes;

import com.mindBehindCase.mindBehindCase.core.utilities.results.Result;
import com.mindBehindCase.mindBehindCase.core.utilities.results.SuccessResult;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oguz_
 */
public class APIManagerTest {

    @Test
    public void testGetComments() {
        System.out.println("getComments");
        APIManager instance = new APIManager();
        Result expResult = new SuccessResult(true);
        Result result = instance.getComments();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestHTTP method, of class APIManager.
     */
    @Test
    public void testRequestHTTP() {
        System.out.println("requestHTTP");
        APIManager instance = new APIManager();
        Result expResult = null;
        Result result = instance.requestHTTP();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
