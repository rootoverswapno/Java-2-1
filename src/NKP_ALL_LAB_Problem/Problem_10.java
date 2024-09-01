package NKP_ALL_LAB_Problem;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<=a/2;++i)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        if(a==sum)
        {
            System.out.println("Number is Perfect");
        }
        else
        {
            System.out.println("Not Perfect");
        }
    }
}
