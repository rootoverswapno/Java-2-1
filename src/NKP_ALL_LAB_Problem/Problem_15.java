package NKP_ALL_LAB_Problem;
class Function_overload{
     int functionoverload(int x,int y)
    {
        return x+y;
    }
    double functionoverload(double x,double y)
    {
        return x+y;
    }
    double functionoverload(int x,int y,int z)
    {
        return x*y*y;
    }
}
public class Problem_15 {
    public static void main(String[] args) {
        Function_overload obj=new Function_overload();
        int m=obj.functionoverload(5,5);
        System.out.println(m);
        double n=obj.functionoverload(5.0,6.0);
        System.out.println(n);
        double o= obj.functionoverload(2,2,2);
        System.out.println(o);
    }
}
