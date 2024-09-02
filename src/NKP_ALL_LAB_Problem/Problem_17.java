package NKP_ALL_LAB_Problem;
abstract class Animal{
    String name;
    Animal(String name)
    {
        this.name=name;
    }
    abstract void sound();
    void display()
    {
        System.out.println("Animal "+name);
    }
}
class dog extends Animal{
    dog(String name)
    {
        super(name);
    }
    void sound()
    {
        System.out.println(name+" woof woof");
    }
}
class cat extends Animal{
    cat(String name)
    {
        super(name);
    }
    void sound()
    {
        System.out.println(name+"  meo meo");
    }
}
public class Problem_17 {
    public static void main(String[] args) {
      Animal Dog=new dog("bob");
      Animal Cat=new cat("tom");
      Dog.display();
      Dog.sound();
      Cat.display();
      Cat.sound();
    }
}
