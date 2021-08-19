package Lesson10;

public class Animal {
    private int age;
    private String name;

    public Animal() {

    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void voice(){
        System.out.println("Grr-rr");
    }

}

