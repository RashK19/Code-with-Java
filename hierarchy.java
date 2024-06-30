// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the inheritance
public class hierarchy {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Dog class inherits methods from Animal class
        myDog.eat();
        myDog.sleep();
        myDog.bark();

        // Cat class inherits methods from Animal class
        myCat.eat();
        myCat.sleep();
        myCat.meow();
    }
}

