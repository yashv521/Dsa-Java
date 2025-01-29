import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a num to check if it's even or odd?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 ==0)
        {
            System.out.println("No is Even");
        }
        else if(num%2 !=0)
        {
            System.out.println("No is Odd");
        }

        }
    }
