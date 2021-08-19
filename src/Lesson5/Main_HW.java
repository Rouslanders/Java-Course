package Lesson5;


public class Main_HW {
    public static void main(String[] args) {
        int vklad = 1000000;
        double procent =  0.06;

                for (int year = 1; year <= 10; year++) {
                    vklad += vklad * procent;
                    System.out.println("За " + year + " лет ваш счет " + vklad + " рублей");
                }
            }
        }


