/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        String chosenMonth;
        int chosenNum;
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");
        while(true) {
            try {
                 chosenNum = Integer.parseInt(strIO("Please enter the number of the month: ", sc));
                if(chosenNum > 0 && chosenNum < 13 ) {
                    chosenMonth=map.get(chosenNum);
                    break;
                }
                else {
                    Exception ex= new Exception();
                    throw ex;
                }
            } catch (Exception ex) {
                System.out.println("Please enter a valid number");
                continue;
            }
        }
        System.out.println("The name of the month is " + chosenMonth);
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
