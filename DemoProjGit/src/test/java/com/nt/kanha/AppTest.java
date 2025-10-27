package com.nt.kanha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	
    @Test
    public void sumWithNegative() {
    	
    	App app=new App();
        int except=-300;
        int actual=app.sum(-100, -200);
        
        assertEquals(except, actual);
        
    }
    @Test
    public void sumWithZero() {
    	App app=new App();
    	int except=0;
    	
    	int actual=app.sum(0, 0);
    	assertEquals(except, actual);
    }
}