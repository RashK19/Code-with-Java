// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to test the method overriding
public class overriding {
    public static void main(String[] args) {
        // Create an instance of the superclass
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Outputs: Animal makes a sound

        // Create an instance of the subclass
        Dog myDog = new Dog();
        myDog.sound(); // Outputs: Dog barks

        // Upcasting: Dog is treated as an Animal
        Animal myDogAsAnimal = new Dog();
        myDogAsAnimal.sound(); // Outputs: Dog barks
    }
}

