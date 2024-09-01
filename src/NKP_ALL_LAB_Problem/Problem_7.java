package NKP_ALL_LAB_Problem;

import java.util.Scanner;

public class Problem_7 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number : ");
            int n=sc.nextInt();
            int digit=0;
            while(n!=0)
            {
                int rev=n%10;
                digit=digit*10+rev;
                n=n/10;
            }
            System.out.println(digit);
    }
}
