package PrimeNo;

import java.util.Scanner;

public class q2var1 {

    public static boolean isPrime(int num)
    {
        if(num <=1) return false;

        for(int i=2; i*i<= num; i++)
        {
            if(num%i == 0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num))
        {
            System.out.println("No is Prime");
        }
        else {
            System.out.println("No is not Prime");
        }
    }


}


