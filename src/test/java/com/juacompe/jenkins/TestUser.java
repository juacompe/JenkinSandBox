/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juacompe.jenkins;

import com.juacompe.jenkinsandbox.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juacompe
 */
public class TestUser {
    
    public TestUser() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createJohn() {
         User user = new User("John");   
         assertEquals("John", user.name);
     }
     
     @Test
     public void createJack() {
         User user = new User("Jack");
         
         assertEquals("Jack", user.name);
     }
}
