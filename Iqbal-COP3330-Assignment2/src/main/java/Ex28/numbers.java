/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hamza Iqbal
 */

package Ex28;

import java.util.Scanner;

public class numbers {

    public static void main(String[] argsas) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            total += in.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }

}
