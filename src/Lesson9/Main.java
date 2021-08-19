package Lesson9;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Slavik");
        User user2 = new User("Vasya");
        User user3 = new User("Ivan");

        Otziv otziv1 = new Otziv(4,5,3,user1);
        Otziv otziv2 = new Otziv(3,4,4,user2);
        Otziv otziv3 = new Otziv(1,2,5,user3);

        Tovar tovar1 = new Tovar(001, "ДоброCад DS01",4399);
        tovar1.addOtziv(otziv2);
        tovar1.addOtziv(otziv1);
        tovar1.addOtziv(otziv3);

        System.out.println(tovar1.ratingTovar());

        System.out.println(user3.toString());



    }
}
