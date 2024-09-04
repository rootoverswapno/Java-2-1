package NKP_ALL_LAB_Problem;
class Encapsulation{
    int length;
    int breadth;
    Encapsulation(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void getarea()
    {
        int area=length*breadth;
        System.out.println("Area is "+area);
    }
}
public class Problem_20 {
    public static void main(String[] args) {
       Encapsulation en=new Encapsulation(4,5);
       en.getarea();
    }
}
