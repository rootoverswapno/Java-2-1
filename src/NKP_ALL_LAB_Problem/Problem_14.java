package NKP_ALL_LAB_Problem;
class Student{
    int roll;
    String name;
    Student()
    {
        roll=0;
        name="";
    }
    Student(int x,String y)
    {
       roll=x;
       name=y;
    }

    public void setName(String name,int roll) {
        this.name=name;
        this.roll=roll;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}
public class Problem_14 {
    public static void main(String[] args) {

        Student st=new Student();
        Student st1=new Student(32,"swapno");
        st.display();
        st1.display();

    }
}
