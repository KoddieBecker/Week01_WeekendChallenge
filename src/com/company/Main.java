package com.company;

import java.util.Scanner;

public class Main {

    Boolean ask = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your number");
        String charecterNumber1 = sc.nextLine();
        int realNumber1 = Integer.parseInt(charecterNumber1);

        System.out.println(" Enter your operator: +, -, /, * ");
        String operator = sc.nextLine();

        System.out.println("Input 2nd number");
        String charecterNumber2 = sc.nextLine();
        int realNumber2 = Integer.parseInt(charecterNumber2);

        int realNumber3 = 0;
        //String charecterNumber3 = sc.nextLine();

        if (operator.equals("+")) {
            realNumber3 = (realNumber1 + realNumber2);

        } else if (operator.equals("/")) {
            realNumber3 = (realNumber1 / realNumber2);

        } else if (operator.equals("*")) {
            realNumber3 = (realNumber1 * realNumber2);


        } else if (operator.equals("-")) {
            realNumber3 = (realNumber1 - realNumber2);
        }

            System.out.println("Final results" + realNumber3);


            System.out.println("Do you want another calculation?");






        }
    }

