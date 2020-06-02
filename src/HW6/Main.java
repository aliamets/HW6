package HW6;

import HW6.Animals.*;
import HW6.Cat.*;
import HW6.Dog.*;

public class Main {

    public static void main(String[] args) {
        int catCount = 0;
        int dogCount = 0;
        Animals[] animal = {
                new Cat("Barsik", "red", 2, 250, 1),
                new Dog("Barbos", "black", 2, 450, 11),
                new Dog("Gaf", "white", 5, 500, 20)
        };
        for (int i = 0; i < animal.length; i++) {
            animal[i].swim();
            animal[i].run();
            if (animal[i] instanceof Cat) {
                catCount++;
            }
            if (animal[i] instanceof Dog) {
                dogCount++;
            }
            System.out.println();
        }
        System.out.println("Всего Котов:" + catCount + "\nВсего Собак:" + dogCount);


    }
}
