/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ratio;
        //First we take in all the information from the user
        //If the user does not input a numerical number, the program will end
        System.out.printf("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = scan.nextInt();
        System.out.printf("How many ounces of alcohol did you have? ");
        int ounces = scan.nextInt();
        System.out.printf("What is your weight, in pounds? ");
        int weight = scan.nextInt();
        System.out.printf("How many hours has it been since your last drink? ");
        int lastDrink = scan.nextInt();
        //The given ratio, determined from the users (Gender) input
        if(gender ==1){
            ratio = 0.73;
        }else{
            ratio = 0.66;
        }
        float BAC = (float)((double)ounces * 5.14 / (double)weight * ratio - (.015 * (double)lastDrink));
        System.out.printf(String.format("\nYour BAC is %.6f\n", BAC));
        if(BAC >= 0.08){
            System.out.println("It is not legal for you to drive.");
        }else{
            System.out.println("It is legal for you to drive.");
        }
    }
}
