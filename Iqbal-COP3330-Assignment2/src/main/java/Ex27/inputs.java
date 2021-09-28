/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hamza Iqbal
 */


package Ex27;

import java.util.*;
import java.lang.*;

public class inputs {

    class I

    {
        public  void main (String[] args) throws
        {
            Scanner sc=new Scanner(System.in);

            System.out.print("so what exactly is balance? ");
            double b;
            b = sc.nextDouble();
            System.out.println(b);

            System.out.print("The APR on the card? ");

            double i;
            i = sc.nextDouble();
            System.out.println(i);

            i = (i/365);


            System.out.print("The montly payment ?");
            double p;
            p = sc.nextDouble();
            System.out.println(p);

            double result;
            double power = Math.pow((i+i),20);
            result = -(1) * (Math.log(1+((b*(1-power))/p)));

            result = result / 20;
            result = result / (Math.log(1+i));
            result = -(result);

            System.out.println("It will take you " + Math.round(result) + " months to pay off this card.");
        }
    }

}
