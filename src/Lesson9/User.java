package Lesson9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

    private String name;
    private Date registerDate;

    public User() {

    }

    public User(String name) {
        this.name = name;
        registerDate = new Date();
    }

    @Override
    public String toString() {
        return "Пользователь: " + name + ", зарегистрирован " + dateFormating();
    }

    public String dateFormating() {
        SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
        return dt1.format(registerDate);
    }

    public String dateFormating(String pattern) {
        SimpleDateFormat dt1 = new SimpleDateFormat(pattern);
        return dt1.format(registerDate);
    }
}
