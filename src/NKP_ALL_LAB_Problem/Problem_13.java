package NKP_ALL_LAB_Problem;

import java.util.Scanner;

class Employe{
     private  int id;
     private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
public class Problem_13 {
    public static void main(String[] args) {

        Employe obj=new Employe();
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int id=sc.nextInt();
        obj.setId(id);
        obj.setName(name);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
