package NKP_ALL_LAB_Problem;
interface Animal2 {
    void sound(); // Abstract method
}

// Implementing classes
class Dog1 implements Animal2 {
    // Implement the sound method for Dog
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 implements Animal2 {
    // Implement the sound method for Cat
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Cow1 implements Animal2 {
    // Implement the sound method for Cow
    public void sound() {
        System.out.println("Cow moos");
    }
}
public class Problem_23 {
    public static void main(String[] args) {
     Animal2 myDog=new Dog1();
     Animal2 mycat=new Cat1();
     Animal2 mycow=new Cow1();
     mycow.sound();
     mycat.sound();
     myDog.sound();
        Animal2[] animals = {myDog, mycat, mycow};

        // Loop through the array and call the sound method
        for (Animal2 animal : animals) {
            animal.sound();
        }
    }
}
