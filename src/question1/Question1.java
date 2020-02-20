/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
import java.util.Scanner;

/**
 *
 * @author 30003926
 */
public class Question1 {

    /**
     * @author 30003926
     */

    public static void main(String[] args) {
        
        //Scanner object
        Scanner sc = new Scanner(System.in); 
        
        //New doubly linked list
        DoublyLinkedList dList = new DoublyLinkedList();
        
        //For loop goes 4 times
        for (int i = 0; i < 4; i++)
        {
            //Prompts to ask for a country
            System.out.println("Type in a country");
            String countryName = sc.nextLine();

            //Prompts to ask for a city
            System.out.println("Type in a city");
            String cityName = sc.nextLine();

            //Add nodes to the list  
            dList.addNode(countryName + ", " + cityName + "\n");   

            Country newCountry = new Country(countryName, cityName);
        }
        
        //Displays the nodes present in the list  
        dList.display();
    }
}
