/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121poetest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ctill
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    Login login  = new Login ();

    @Test
    public void testCheckUserNameCorrectlyFormatted() 
    {
        boolean actual = login.checkUserName("mi_1");
        assertTrue(actual);
    }
    
      @Test
    public void testCheckUserNamePoorlyFormatted() 
    {
        boolean actual = login.checkUserName("mi_1!!!!!!");
        assertFalse(actual);
    }

    @Test
    public void testCheckPasswordComplexity() 
    {
        
    }

    @Test
    public void testRegisterUser() {
    }

    @Test
    public void testLoginUser() {
    }
    
}
