/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice.pkg4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author corde
 */
public class ICE4Test {
    
    public ICE4Test() {
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

    
    /**
     * Test of checkChar method, of class ICE4.
     */
    
    
    @Test 
    public void testCheckChar() {
        System.out.println("checkChar");
        String word2 = "abcde";
        char letter2 = 'a';
        boolean expResult = true;
        boolean result = ICE4.checkChar(word2, letter2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test (expected = Exception.class)
    public void testCheckChar2() {
        System.out.println("checkChar");
        String word2 = null;
        char letter2 = ' ';
        boolean expResult = false;
        boolean result = ICE4.checkChar(word2, letter2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bigChar method, of class ICE4.
     */
    @Test
    public void testBigChar() {
        System.out.println("bigChar");
        char[] list = {'a','c','d','e','f'};
        char expResult = 'f';
        char result = ICE4.bigChar(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    /**
     * Test of bigChar method, of class ICE4.
     */
    @Test (expected=Exception.class)
    public void testBigChar2() {
        System.out.println("bigChar");
        char[] list = null;
        char expResult = ' ';
        char result = ICE4.bigChar(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of charCount method, of class ICE4.
     */
    @Test
    public void testCharCount() {
        System.out.println("charCount");
        String word = "cordelle";
        char letter = 'l';
        int expResult = 2;
        int result = ICE4.charCount(word, letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of charCount method, of class ICE4.
     */
    @Test (expected=Exception.class)
    public void testCharCount2() {
        System.out.println("charCount");
        String word = null;
        char letter = ' ';
        int expResult = 0;
        int result = ICE4.charCount(word, letter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
