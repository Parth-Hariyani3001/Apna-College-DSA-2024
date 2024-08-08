
public class Inheritance {

    public static void main(String[] args) {
        // Fish fish1 = new Fish();
        // fish1.eat();
        // fish1.Swim();
    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

//Single Level Inheritance
// class Fish extends Animal {
//     int fins;
//     void Swim() {
//         System.out.println("Swims in water");
//     }
// }
//Multilevel Inheritance
class Mammal extends Animal {

    int legs;
}

class Dog extends Mammal {

    int paws;
}

//Hierarchical Inheritance
class Fish extends Mammal {

    int fins;
}

//Hybrid Inheritance -> combination of various types of inheritance
