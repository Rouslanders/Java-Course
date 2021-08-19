package Lesson13;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());
        matrix1.setValueAt(0, 0, 1);
        matrix1.setValueAt(0, 1, 2);
        matrix1.setValueAt(0, 2, 13);
        matrix1.setValueAt(1, 0, 3);
        matrix1.setValueAt(1, 1, 1);
        matrix1.setValueAt(1, 2, 2);
        matrix1.setValueAt(2, 0, 3);
        matrix1.setValueAt(2, 1, 2);
        matrix1.setValueAt(2, 2, 1);

        matrix2.setValueAt(0, 0, 2);
        matrix2.setValueAt(0, 1, 2);
        matrix2.setValueAt(0, 2, 2);
        matrix2.setValueAt(1, 0, 2);
        matrix2.setValueAt(1, 1, 2);
        matrix2.setValueAt(1, 2, 2);
        matrix2.setValueAt(2, 0, 2);
        matrix2.setValueAt(2, 1, 2);
        matrix2.setValueAt(2, 2, 2);


        //System.out.println(matrix1.isNullMatrix());
       // System.out.println(matrix1.isIdentityMatrix());
       // matrix1.isSquareMatrix();
  System.out.println(matrix1.getValueAt(2, 0));
        matrix1.setValueAt(2,1,1);
       // matrix1.mul(5);
     // matrix1.printToConsole();
        //matrix1.transpose();

    }
}