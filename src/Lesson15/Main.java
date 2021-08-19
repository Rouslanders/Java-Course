package Lesson15;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(1000);
        } catch (UncurrentAgeException e) {
            System.out.println("неверно указан возраст!!!");

        }

    }
}
