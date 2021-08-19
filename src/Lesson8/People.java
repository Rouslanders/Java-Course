package Lesson8;

public class People extends Object{
    // переменные (поля класса)
    // констуркторы
    // методы

    private String name;
    private int age;
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return this.age;

    }

    public String getName() {
        return this.name;

    }

    public String getPhoneNumber() {
        return this.phoneNumber;

    }
}
