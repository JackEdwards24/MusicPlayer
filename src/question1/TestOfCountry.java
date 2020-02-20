/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 30003926
 */
public class TestOfCountry {
    public static void main(String args[]) 
    {       
        test();       
    }
    
        @Test
    public static void test()
    {
        Country country = new Country("France", "Paris");
        
        assertTrue(country.countryName.compareTo("France") == 0);
    }
    
}
