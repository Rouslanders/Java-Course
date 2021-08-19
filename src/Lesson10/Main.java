package Lesson10;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Animal[] zoo = {cat1, cat2, dog1, dog2};

        for (int i = 0; i < zoo.length ;i++){
            zoo[i].voice();
        }
    }

}
