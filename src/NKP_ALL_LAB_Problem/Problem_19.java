package NKP_ALL_LAB_Problem;
class Animal1{
    void sound()
    {
        System.out.println("Animal makes a sound ");
    }
}
class Dog extends Animal1{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal1{
    void sound()
    {
        System.out.println("Cat moves ");
    }
}
public class Problem_19 {
    public static void main(String[] args) {
     Animal1 mydog=new Dog();
     Animal1 mycat=new Cat();

     mydog.sound();
     mycat.sound();
    }
}
