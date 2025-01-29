package PrimeNo;

import java.util.Scanner;

//Checking for Prime Numbers
//Difficulty: Easy
//Topics: Basic Programming, Number Theory
//Description: Write a program to determine if a number is prime.
//Example:
//Input: number = 7
//Output: Prime
public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No:");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num<=1) {
            System.out.println("Not Prime");
            return;
        }

        for(int i=2; i*i<=num; i++)
        {

            if(num % i == 0 )
            {
                isPrime= false;
                break;
            }

        }
        if(isPrime)
            System.out.println("It's Prime");
        else{
            System.out.println("It's not Prime");
        }

    }
}

//Note--> Check edge cases for i=1 usse kam ya 2 se start krna hai think these through
//Dry run kro bhai yha don't rush to solving it make a solid logic first think all testcases
//Bydefault prime ko true leke chlo not vis versa
