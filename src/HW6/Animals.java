package HW6;

public abstract class Animals {
    String name;
    String color;
    int age;
    int runDistance;
    int swimDistance;

    public Animals(String name, String color, int age, int runDistance, int swimDistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public abstract void run();

    //    public void run() {
//        System.out.println(name + " run...");
//    }
    public abstract void swim();
//    public void swim() {
//        System.out.println(name + " swim...");
//    }
}
