package NKP_ALL_LAB_Problem;
class student{
    String name;
    int roll;
    double result;
    student(String name,int roll,double result)
    {
        this.name=name;
        this.roll=roll;
        this.result=result;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Result : "+result);
    }
}
public class Problem_11 {
    public static void main(String[] args) {
     student st=new student("swapno",32,3.45);
     st.display();
    }
}
