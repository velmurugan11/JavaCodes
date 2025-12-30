// Demonstration of explicit type casting in Java
// TYPE CASTING - Converting one data type to another
// PRIMITIVE TYPE CASTING - WIDENING AND NARROWING
    // IMPLICIT TYPE CASTING (WIDENING) - AUTOMATIC - done by compiler
    // EXPLICIT TYPE CASTING (NARROWING) - MANUAL - done by programmer
// NON-PRIMITIVE TYPE CASTING - UPCASTING AND DOWNCASTING


class TypeCast {
    public static void main(String[] args){

        // Primitive Type Casting
        // Implicit Type Casting (Widening)
        int num = 100;
        double number = num; // Automatic type casting from int to double
        System.out.println("The double value is: " + number);

        // Explicit Type Casting (Narrowing)
        double val = 9.778;
        int intval = (int) val; // Explicit type casting from double to int
        System.out.println("The integer value is [Data Loss]: " + intval);

        class Animal {
            void makeSound() {
                System.out.println("Animal sound");
            }
            void eat(){
                System.out.println("Eat Food");
            }
        }
        class Dog extends Animal {
            @Override
            void makeSound() {
                System.out.println("Bark");
            }
            void play() {
                System.out.println("Dog is playing");
            }
        }

        class Cat extends Animal {
            @Override
            void makeSound(){
                System.out.println("Meow");
            }
            void scratch() {
                System.out.println("Cat is scratching");
            }
        }
        // Non-Primitive Type Casting
        // Upcasting
        Animal myAnimalDog = new Dog(); // Upcasting - Dog to Animal
        myAnimalDog.makeSound();
        myAnimalDog.eat();

        // Downcasting
        Dog myDog = (Dog) myAnimalDog; // Downcasting - Animal to Dog
        myDog.makeSound();
        myDog.play();
        
        Animal myAnimalCat = new Cat();
        myAnimalCat.makeSound();
        myAnimalCat.eat();

        Cat myCat = (Cat) myAnimalCat;
        myCat.makeSound();
        myCat.scratch();

        // if (myAnimal instanceof Dog) {
        //     Dog myDog = (Dog) myAnimal;
        //     myDog.play();
        // } else if (myAnimal instanceof Cat) {
        //     Cat myCat = (Cat) myAnimal;
        //     myCat.scratch();
        // }
    }
}