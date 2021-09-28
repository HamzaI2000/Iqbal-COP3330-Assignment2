/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hamza Iqbal
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hamza Iqbal
 */

package Ex30;

import java.util.Scanner;

public class multitable {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            try {
                System.out.print("What is the rate of return? ");
                int r = Integer.parseInt(sc.next());
                System.out.println("It will take " + (72 / r) + " yrs to 2x the IV.");
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Sorry. This is not a valid input");

                {
                    System.out.println("Sorry. This is not a valid input");
                }
                if (flag) {
                    break;
                }

            }
        }

    }}