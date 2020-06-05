package HW6;

public class Cat extends Animals {

    public Cat(String name, String color, int age, int runDistance, int swimDistance) {
        super(name, color, age, runDistance, swimDistance);
    }

    @Override
    public void run() {
        if (runDistance <= 200 && runDistance > 0) {
            System.out.println(name + ":\n" + runDistance + " метров, ну ладно...Мяу, бери меня на ручки и побежали :)");
        } else {
            System.out.println(name + ":\nСначала Whiskas, а там посмотрим....:) Ты хотел заставить бюежать аж:" + runDistance + " метров");
        }
    }

    @Override
    public void swim() {
        System.out.println(name + ": " + "\nНет.....Только не в воду...я плавать не умею, МЯУУУ");
    }

}
