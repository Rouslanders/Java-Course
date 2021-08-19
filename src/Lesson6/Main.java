package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите фигуру:");
        System.out.println("1 - квадрат");
        System.out.println("2 - треугольник");
        System.out.println("3 - круг");
        System.out.println("4 - овал");
        System.out.println("5 - трапеция");

        Scanner scanner = new Scanner(System.in);
        String inputFigure = scanner.nextLine();

        System.out.println("Площадь или периметр?");
        String inputAction = scanner.nextLine();

        if (inputFigure.equalsIgnoreCase("квадрат") || inputFigure.equals("1")) {
            System.out.println("Введите сторону квадрата");
            String side = scanner.nextLine();
            int sideNum = Integer.parseInt(side);
            if (inputAction.equalsIgnoreCase("площадь" )){
                System.out.println("Площадь квадрата :" + (sideNum * sideNum));
            } else if (inputAction.equalsIgnoreCase("периметр" )) {
                System.out.println("Периметр квадрата :" + (sideNum * sideNum));
            } else {
                System.out.println("Такой фигуры нет");
            }
        } else if (inputFigure.equalsIgnoreCase("треугольник") || inputFigure.equals("2")) {

        } else if (inputFigure.equalsIgnoreCase("круг") || inputFigure.equals("3")) {

        } else if (inputFigure.equalsIgnoreCase("овал") || inputFigure.equals("4")) {

        } else if (inputFigure.equalsIgnoreCase("трапеция") || inputFigure.equals("5")) {

        } else {
            System.out.println(" Такой фигуры в нашей программе нет");
        }


        }
    }
