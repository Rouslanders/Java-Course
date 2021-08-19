package Lesson6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите фигуру");
        System.out.println("1. квадрат");
        System.out.println("2. треугольник");
        System.out.println("3. круг");
        System.out.println("4. овал");
        System.out.println("5. трапеция");

        Scanner scanner = new Scanner(System.in);
        String inputFigure = scanner.nextLine();


        System.out.println("Площадь или периметр?");
        String inputAction = scanner.nextLine();
//Квадрат
        if (inputFigure.equalsIgnoreCase("квадрат") || inputFigure.equals("1")) {
            System.out.println("Введите сторону квадрата");
            String side = scanner.nextLine();
            int sideNum = Integer.parseInt(side);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь квадрата" + sideNum * sideNum);
            } else if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр квадрата" + sideNum * 4);
            } else {
                System.out.println("Такое действие не предусмотрено");
            }


            //Треугольник Площадь Треугольника
        } else if (inputFigure.equalsIgnoreCase("треугольник") || inputFigure.equals("2")) {
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Введите сторону треугольника");
                String sideOfTheTriangle = scanner.nextLine();
                int sideNumTriangle = Integer.parseInt(sideOfTheTriangle);
                System.out.println("Введите высоту треугольника");
                String heightOfTheTriangle = scanner.nextLine();
                int heightNumTriangle = Integer.parseInt(heightOfTheTriangle);
                int ariaOfTheTriangle = (sideNumTriangle * heightNumTriangle) / 2;
                System.out.println("Площадь треугольника " + ariaOfTheTriangle);
            }


            //Периметр Треугольника
            if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Введите сторону треугольника А");
                String sideOfTheTriangleA = scanner.nextLine();
                int sideNumTriangleA = Integer.parseInt(sideOfTheTriangleA);

                System.out.println("Введите сторону треугольника B");
                String sideOfTheTriangleB = scanner.nextLine();
                int sideNumTriangleB = Integer.parseInt(sideOfTheTriangleB);

                System.out.println("Введите сторону треугольника C");
                String sideOfTheTriangleC = scanner.nextLine();
                int sideNumTriangleC = Integer.parseInt(sideOfTheTriangleC);

                int perimeterOfTheTriangle = sideNumTriangleA + sideNumTriangleB + sideNumTriangleC;
                System.out.println("Периметр треугольника" + perimeterOfTheTriangle);
            } else {
                System.out.println("Такое действие не предусмотрено");
            }

            //Круг
        } else if (inputFigure.equalsIgnoreCase("круг") || inputFigure.equals("3")) {
            System.out.println("Введите радиус круга");
            String radiusOfTheCircle = scanner.nextLine();
            int sideNumCircle = Integer.parseInt(radiusOfTheCircle);

            //Площадь Круга
            if (inputAction.equalsIgnoreCase("Площадь")) {
                double ariaOfTheCircle = Math.PI * sideNumCircle * sideNumCircle;
                System.out.println("Площадь круга " + ariaOfTheCircle);
            }

            // Периметр (Окружность) Круга
            else if (inputAction.equalsIgnoreCase("Периметр")) {

                double circleCircumference = 2 * Math.PI * sideNumCircle;
                System.out.println("Периметр (окружность) круга " + circleCircumference);
            } else {
                System.out.println("Такое действие не предусмотрено");
            }

            //Овал
        } else if (inputFigure.equalsIgnoreCase("овал") || inputFigure.equals("4")) {
            System.out.println("Введите размер полуоси А");
            String bigLineElipse = scanner.nextLine();
            int bigLineA = Integer.parseInt(bigLineElipse);
            System.out.println("Введите размер полуоси Б");
            String smollLineElipse = scanner.nextLine();
            int smallLineB = Integer.parseInt(smollLineElipse);
            if (bigLineA < smallLineB) {
                System.out.println("Размер полуоси А не может быть меньше полуоси Б");
                return;
            }

            //Площадь Овала
            if (inputAction.equalsIgnoreCase("Площадь")) {
                double ariaOfTheElipse = Math.PI * bigLineA * smallLineB;
                System.out.println("Площадь овала " + ariaOfTheElipse);
            }

            // Периметр (Окружность) Овала
            else if (inputAction.equalsIgnoreCase("Периметр")) {

                double elipseCircumference = 4 * (Math.PI * bigLineA * smallLineB + (bigLineA - smallLineB)) / bigLineA + smallLineB;
                System.out.println("Периметр (окружность) овала " + elipseCircumference);
            } else {
                System.out.println("Такое действие не предусмотрено");
            }

            //Трапеция
        } else if (inputFigure.equalsIgnoreCase("трапеция") || inputFigure.equals("5")) {
            System.out.println("Введите сторону трапеции А");
            String sideOfTheTrapezoidA = scanner.nextLine();
            int sideNumTrapezoidA = Integer.parseInt(sideOfTheTrapezoidA);
            System.out.println("Введите сторону трапеции Б");
            String sideOfTheTrapezoidB = scanner.nextLine();
            int sideNumTrapezoidB = Integer.parseInt(sideOfTheTrapezoidB);

            //Площадь трапеции
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Введите высоту трапеции");
                String heightOfTheTrapezoid = scanner.nextLine();
                int heightNumTrapezoid = Integer.parseInt(heightOfTheTrapezoid);
                double ariaOfTheTrapezoid = heightNumTrapezoid * (sideNumTrapezoidA + sideNumTrapezoidB) / 2;
                System.out.println("Площадь треугольника " + ariaOfTheTrapezoid);
            }

            //Периметр трапеции
            if (inputAction.equalsIgnoreCase("Периметр")) {
                System.out.println("Введите сторону треугольника C");
                String sideOfTheTrapezoidC = scanner.nextLine();
                int sideNumTrapezoidC = Integer.parseInt(sideOfTheTrapezoidC);

                System.out.println("Введите сторону треугольника D");
                String sideOfTheTrapezoidD = scanner.nextLine();
                int sideNumTrapezoidD = Integer.parseInt(sideOfTheTrapezoidD);

                int perimeterOfTheTrapezoid = sideNumTrapezoidA + sideNumTrapezoidB + sideNumTrapezoidC + sideNumTrapezoidD;
                System.out.println("Периметр треугольника" + perimeterOfTheTrapezoid);
            } else {
                System.out.println("Такое действие не предусмотрено");
            }
        } else {
            System.out.println("Такой фигуры в нашей программе нет");
        }
    }
}
