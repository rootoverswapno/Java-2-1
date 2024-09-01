package NKP_ALL_LAB_Problem;

import java.util.Scanner;

class evenodd{
    int num;
    void setNum(int num)
    {
        this.num=num;
    }
    void even_odd()
    {
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number not odd");
        }
    }
}
public class Problem_12 {
    public static void main(String[] args) {
       evenodd obj=new evenodd();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        obj.setNum(a);
        obj.even_odd();
    }
}
