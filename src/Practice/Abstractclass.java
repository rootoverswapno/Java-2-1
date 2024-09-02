package Practice;
abstract class Animal{
    abstract void sound();
    void sleep()
    {
        System.out.println("This animal is sleeping");
    }
}
class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}
public class Abstractclass {
    public static void main(String[] args) {
      Animal dog=new Dog();
      Animal cat=new Cat();

      dog.sound();
      cat.sound();

      dog.sleep();
      cat.sleep();
    }
}
