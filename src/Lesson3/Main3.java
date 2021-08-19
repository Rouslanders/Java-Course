package Lesson3;

public class Main3 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] nmty = {'n', 'm', 't', 'y'};
        char[] unity = new char[abcd.length + nmty.length];

        unity[0] = abcd[0];
        unity[1] = abcd[1];
        unity[2] = abcd[2];
        unity[3] = abcd[3];

        unity[4] = nmty[0];
        unity[5] = nmty[1];
        unity[6] = nmty[2];
        unity[7] = nmty[3];
        for (int i = 0; i < unity.length; i++) {
            if (i < 4 ){unity[i] = abcd[i];
            } else{
                unity[i] = nmty[i-abcd.length];
            }
            System.out.println(unity[i]);
        }
    }
}