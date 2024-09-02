package NKP_ALL_LAB_Problem;

import java.util.Scanner;

public class Problem_29 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and colum : ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int []onearray=new int [m*n];
        int ct=0;
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
            {
                onearray[ct++]=arr[i][j];
            }
        }
        for(int i=0;i<onearray.length;i++)
        {
            System.out.print(onearray[i]+" ");
        }


    }
}
