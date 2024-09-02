package NKP_ALL_LAB_Problem;
class Constructor{
    Constructor(String name)
    {
        System.out.println(name);
    }
    Constructor(String name ,int age)
    {
        System.out.println(name+" "+age);
    }
    Constructor(String name,int age,double salary)
    {
        System.out.println(name+" "+age+" "+salary);
    }
}
public class Problem_16 {
    public static void main(String[] args) {
     Constructor obj=new Constructor("swapno");
     Constructor obj1=new Constructor("swapno",22);
     Constructor obj2=new Constructor("swapno",22,10.00);
    }
}
