package LeapYr;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year for checking leap yrs");
        int yr = sc.nextInt();
        if(yr%400==0 || (yr%4==0 && yr%100 !=0))
        {
                System.out.println("Leap Yr");
        }
        else {
            System.out.println("Normal Yr");
        }
    }

}
