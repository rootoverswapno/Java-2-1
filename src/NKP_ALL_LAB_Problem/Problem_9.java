package NKP_ALL_LAB_Problem;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size= Sc.nextInt();
        int []array=new int[size];

        System.out.println("Enter Element ");
        for(int i=0;i< array.length;++i) {
            System.out.println("Element" + (i + 1) + "IS : ");
            array[i] = Sc.nextInt();
        }
        for(int i=0;i<array.length;++i)
        {
            System.out.println(array[i]);
        }



    }
}
