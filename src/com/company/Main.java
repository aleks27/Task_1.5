package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       System.out.println ("Enter 3 integer numbers: ");
       int number1 = a.nextInt();
       int number2 = a.nextInt();
       int number3 = a.nextInt();
       System.out.println(number1 + number2 + number3);
       System.out.println(number1 * number2 * number3);
   }
}
