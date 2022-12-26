package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to introduce yourself ?");
        String res = scanner.nextLine();
        if (res.equals("yes")){
            System.out.println("Type your first name .");
            String first = scanner.nextLine();
            System.out.println("Type your last name .");
            String last = scanner.nextLine();
            System.out.println("Type your age  .");
            int age = scanner.nextInt();

            Person person = new Person(first, last, age);
            person.introduce();
        }
    }
}
