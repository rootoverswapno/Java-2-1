package NKP_ALL_LAB_Problem;

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int gcd=findGcd(num1,num2);
        System.out.println(gcd);
    }
    static int findGcd(int a, int b)
    {
        if(b==0)
            return b;
        return findGcd(b,a%b);
    }
}
