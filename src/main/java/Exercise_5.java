/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String temp = scanner.nextLine();
        int f_num = Integer.parseInt(temp);

        System.out.print("What is the second number? ");
        String temp2 = scanner.nextLine();
        int s_num = Integer.parseInt(temp2);

        System.out.println(f_num + " + " + s_num + " = " + (f_num + s_num) + "\n" +
        f_num + " - " + s_num + " = " + (f_num - s_num) + "\n" +
        f_num + " * " + s_num + " = " + (f_num * s_num) + "\n" +
        f_num + " / " + s_num + " = " + (f_num / s_num));
    }
}
