package Lesson13;

public class Matrix implements IMatrix {
    private double[][] matrix;


    public Matrix(double[][] sum) {
        matrix = new double[IMatrix.DEFAULT_MATRIX_SIZE][IMatrix.DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    @Override
    public int getRows() {
        return matrix.length;
    }


    @Override
    public int getColumns() {
        return matrix[0].length;
    } //ссылаемся на всю первую строку ,т.е. количество колонок матрицы (масива)

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || colIndex < 0 || rowIndex >= getRows() || colIndex >= getColumns()) {
            throw new IndexOutOfBoundsException("индекс строки меньше нуля или больше (или равно) количества строк матрицы\n" +
                    " или индекс столбца меньше нуля или больше (или равно) количества столбцов матрицы");
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || colIndex < 0 || rowIndex >= getRows() || colIndex >= getColumns()) {
            throw new IndexOutOfBoundsException("индекс строки меньше нуля или больше (или равно) количества строк матрицы\n" +
                    " или индекс столбца меньше нуля или больше (или равно) количества столбцов матрицы");
        }
        if (rowIndex >= this.getRows()) {
            System.out.println("Ты ошиблся индексом строки");
            return;
        }
        if (colIndex >= this.getColumns()) {
            System.out.println("Ты ошибся индексом строки");
            return;
        }
        matrix[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        double[][] sum = new double[getRows()][getColumns()];
        int numberOfRows = getRows() < otherMatrix.getRows() ? getRows() : otherMatrix.getRows();
        int numberOfColumns = getColumns() < otherMatrix.getColumns() ? getColumns() : otherMatrix.getColumns();
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                sum[i][j] = matrix[i][j] + otherMatrix.getValueAt(i, j);
            }
        }
        return new Matrix(sum);
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        double[][] sub = new double[getRows()][getColumns()];
        int numberOfRows = getRows() < otherMatrix.getRows() ? getRows() : otherMatrix.getRows();
        int numberOfColumns = getColumns() < otherMatrix.getColumns() ? getColumns() : otherMatrix.getColumns();
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                sub[i][j] = matrix[i][j] - otherMatrix.getValueAt(i, j);
            }
        }
        return new Matrix(sub);
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        double[][] mul = new double[getRows()][getColumns()];
        int numberOfRows = getRows() < otherMatrix.getRows() ? getRows() : otherMatrix.getRows();
        int numberOfColumns = getColumns() < otherMatrix.getColumns() ? getColumns() : otherMatrix.getColumns();
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                mul[i][j] = matrix[i][j] * otherMatrix.getValueAt(i, j);
            }
        }

        return new Matrix(mul);


    }

    @Override
    public IMatrix mul(double value) {
        double n = value;
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                matrix[i][j] = matrix[i][j] * n;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return null;
    }


    @Override
    public IMatrix transpose() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        return null;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i != j) {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                } else {
                    if (i == j) {
                        if (matrix[i][j] != 0) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    @Override
    public boolean isSquareMatrix() {
        if (getRows() == getColumns()) {
            System.out.println("Эта матрица - квадратная");
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
