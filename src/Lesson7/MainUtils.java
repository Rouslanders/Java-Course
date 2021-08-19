package Lesson7;

public class MainUtils {
    //1- модификатор доступа
    //public - доступ внутри всего проекта
    //_____ - доступ внутри текущего пакета
    //protected - доступ внутритекущего класса и подкдласса, и текущего пакета
    //private - доступ внутри текущего класса

    //2 static (есть ли нет)
    //3 слово - возвращаемый тип из метода (или void) если его нет
    //4 название метода
    //5 входящие параметры (..., .....), когда параметры не нужны, то скобки пустые
    //6 тело выполнения метода


    public static int min(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void printmax(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);

        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}



