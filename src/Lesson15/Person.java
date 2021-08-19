package Lesson15;

public class Person {
    private  int age;
    private String name;


    public void setAge(int age) throws UncurrentAgeException {
        if (age > 150 || age < 0){
            throw new UncurrentAgeException("возраст не может быть меньше 0 или больше 150");
        }
    }

}
