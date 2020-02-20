/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author 30003926
 */
public class Country {
        String countryName;
        //New city object
        City myCity = new City();
        
        //default constructor
        public Country(String name, String cityName){
            countryName = name;
        }
        
        private class City {
            String cityName;
        }
}
