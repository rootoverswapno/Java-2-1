package NKP_ALL_LAB_Problem;

public class Problem_30 {
    public static void main(String[] args) {
        int [][]raggedarray=new int [3][];
        raggedarray[0]=new int[3];
        raggedarray[1]=new int[2];
        raggedarray[2]=new int[4];
        int val=1;
        for(int i=0;i<raggedarray.length;++i)
        {
            for(int j=0;j<raggedarray[i].length;++j)
            {
                raggedarray[i][j]=val++;
            }
        }
        System.out.println("Ragged Array:");
        for (int i = 0; i <raggedarray.length; i++) {
            for (int j = 0; j < raggedarray[i].length; j++) {
                System.out.print(raggedarray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
