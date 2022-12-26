package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        // TODO: Implement method       
        double result = 18.84;
        int ccf = 0;
        if (gallonsUsage > 1496){ 
            double rest = gallonsUsage - 1496;
            ccf = (int) rest / 748; 
            if (rest < 748)
                return result + 3.9;
            if (ccf > 0){ 
                if (rest % (748 * ccf) > 0){
                    ccf++;
                }
                result += 3.9 * ccf;
            }
        }     
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();    }
}
