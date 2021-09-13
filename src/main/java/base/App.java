/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        System.out.println("What is your height in inches?:  ");
        String height = in.nextLine();
        System.out.println("What is your weight in pounds?:  ");
        String weight = in.nextLine();

        try {
            double h = Double.parseDouble(height);
            double w = Double.parseDouble(weight);

            double BMI = (w / (h * h)) * 703;

            if (BMI < 18.5) {
                System.out.println("Your BMI is " + df.format(BMI) + " .\nYou are underweight. You should see your doctor.");
                return;
            } else if (BMI > 25) {
                System.out.println("Your BMI is " + df.format(BMI) + " .\nYou are overweight. You should see your doctor.");
                return;
            } else {
                System.out.println("Your BMI is " + df.format(BMI) + " .\nYou are within the ideal weight range.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("There was an error in your inputs. Restart program");
            return;
        }
    }
}
