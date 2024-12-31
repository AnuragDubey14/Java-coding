// Superclass (Parent class)
class Animal {
    // Method in superclass
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        super.sound();
        System.out.println("Bark");
    }
}

// Another subclass (Child class)
class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Dog animal1 = new Dog();
        Cat animal2 = new Cat();

        animal1.sound(); // Calls Dog's sound method
        animal2.sound(); // Calls Cat's sound method

    }
}
