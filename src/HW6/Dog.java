package HW6;

import java.util.Random;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class Dog extends Animals {
    public Dog(String name, String color, int age, int runDistance, int swimDistance) {
        super(name, color, age, runDistance, swimDistance);
    }
    Random random;

    int maxRunDistance;

    @Override
    public void run() {
        maxRunDistance = (int) (400+200 * random(1));


        if (maxRunDistance >= runDistance) {
            System.out.println(name + ": " + runDistance + " метров, догоняй...или я буду первый!!! :)");
        } else {
            System.out.println(name + ":\nБеги сам туда:) Ты хотел заставить бежать аж :" + runDistance + " метров, а я могу лишь " + maxRunDistance+ " метров");
        }
    }

   /* public Dog(String name, String color, int age, int runDistance, int swimDistance, int maxRunDistance) {
        super(name, color, age, runDistance, swimDistance);
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public void run() {
        if (maxRunDistance >= runDistance) {
            System.out.println(name + ": " + runDistance + " метров, догоняй...или я буду первый!!! :)");
        } else {
            System.out.println(name + ":\nБеги сам туда:) Ты хотел заставить бежать аж :" + runDistance + " метров, а я могу лишь " + maxRunDistance+ " метров");
        }
    }*/


//    @Override
//    public void run() {
//        if (runDistance <= 500 && runDistance > 0) {
//            System.out.println(name + ": " + runDistance + " метров, догоняй...или я буду первый!!! :)");
//        } else {
//            System.out.println(name + ":\nБеги сам туда, для меня слишком далеко, я лучше тут полежу:) Ты хотел заставить бюежать аж:" + runDistance + " метров");
//        }
//    }


    @Override
    public void swim() {
        if (swimDistance <= 10) {
            System.out.println(name + ": " + swimDistance + "метров");
        } else {
            System.out.println(name + ":\nБез спасательного желета? Нет! ни за что! Хотел заставить плыть: " + swimDistance + " метров");

        }
    }


}
