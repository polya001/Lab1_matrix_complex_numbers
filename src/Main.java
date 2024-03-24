//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Создаем два комплексных числа а и b
        ComplexNumbers a = new ComplexNumbers(2,1);
        ComplexNumbers b = new ComplexNumbers(-4,2);
        System.out.print("Current numbers\n");
        a.print();
        System.out.println();
        b.print();
        System.out.println();

        //Вычисляем сумму чисел а и b
        System.out.print("\nSum of numbers\n");
        ComplexNumbers c = ComplexNumbers.sum(a,b);
        c.print();
        System.out.println();

        //Вычисляем разность чисел а и b
        ComplexNumbers d = ComplexNumbers.diff(a,b);
        System.out.print("\nDifference\n");
        d.print();
        System.out.println();

        //Вычисляем произведение чисел а и b
        ComplexNumbers m = ComplexNumbers.mult(a,b);
        System.out.print("\nMultiplication\n");
        m.print();
        System.out.println();

        //Вычисляем частное чисел а и b
        ComplexNumbers dv = ComplexNumbers.div(a,b);
        System.out.print("\nDivision\n");
        dv.print();
        System.out.println();

        //Создаем матрицы комплексных чисел matrix и matrix2
        ComplexNumbers[][] arr = {{new ComplexNumbers(5,3),new ComplexNumbers(3)},{new ComplexNumbers(5), new ComplexNumbers(-4,6)}};
        Matrix matrix=new Matrix(arr);
        System.out.print("\nMatrix1\n");
        matrix.print();
        System.out.println();

        ComplexNumbers[][] arr2 = {{new ComplexNumbers(-1,1),new ComplexNumbers(2,1)},{new ComplexNumbers(-2), new ComplexNumbers(2,-1)}};
        Matrix matrix2=new Matrix(arr2);
        System.out.print("\nMatrix2\n");
        matrix2.print();

        //Складываем матрицы matrix и matrix2
        Matrix matrix_sum = Matrix.sum(matrix,matrix2);
        System.out.print("\nMatrix addition\n");
        matrix_sum.print();

        //Вычитаем матрицы matrix и matrix2
        Matrix matrix_dif = Matrix.dif(matrix,matrix2);
        System.out.print("\nMatrix subtraction\n");
        matrix_dif.print();

        //Перемножаем матрицы matrix и matrix2
        System.out.print("\nMultiplying a matrixs\n");
        Matrix matrix_mult = Matrix.mult(matrix,matrix2);
        matrix_mult.print();

        //Умножаем матрицу matrix на число
        System.out.print("\nMultiplying a matrix1 by a number\n");
        matrix.MultNum(new ComplexNumbers(5));
        matrix.print();

        //Транспонируем матрицу matrix2
        System.out.print("\nTranspose matrix2\n");
        matrix2.transpon();
        matrix2.print();



    }
}
