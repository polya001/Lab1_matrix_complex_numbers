public class Matrix {
    private int rows, cols;
    private ComplexNumbers[][]  complexarr;
    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    Matrix(int rows1,int cols1){
        rows=rows1;
        cols=cols1;
        complexarr = new ComplexNumbers[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                complexarr[i][j]= new ComplexNumbers();
            }
        }

    }

    Matrix(){
        this(0,0);
    }

    Matrix(ComplexNumbers[][] arr){
        rows=arr.length;
        cols=arr[0].length;
        complexarr = new ComplexNumbers[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                complexarr[i][j]= new ComplexNumbers(arr[i][j].getReal(),arr[i][j].getImag());
            }
        }


    }

    public static Matrix sum(Matrix a, Matrix b){
        if(a.cols!=b.cols || a.rows!= b.rows){
            System.out.print("\nSize error:You can't add matrices of different sizes");
            return new Matrix();
        }
        Matrix res = new Matrix(a.rows,a.cols);
        for (int i=0;i<a.rows;i++){
            for (int j=0;j<a.cols;j++){
                res.complexarr[i][j]= ComplexNumbers.sum(a.complexarr[i][j],b.complexarr[i][j]);
            }
        }
        return res;
    }

    public static Matrix dif(Matrix a, Matrix b){
        if(a.cols!=b.cols || a.rows!= b.rows){
            System.out.print("\nSize error:You can't subtract of different sizes");
            return new Matrix();
        }
        Matrix res = new Matrix(a.rows,a.cols);
        for (int i=0;i<a.rows;i++){
            for (int j=0;j<a.cols;j++){
                res.complexarr[i][j]= ComplexNumbers.diff(a.complexarr[i][j],b.complexarr[i][j]);
            }
        }
        return res;
    }

    public void MultNum(ComplexNumbers num){
        for (int i=0;i<this.rows;i++){
            for (int j=0;j<this.cols;j++){
                this.complexarr[i][j]= ComplexNumbers.mult(this.complexarr[i][j],num);
            }
        }
    }

    public static Matrix mult(Matrix a, Matrix b){
        if(a.cols!= b.rows){
            System.out.print("\nSize error");
            return new Matrix();
        }
        Matrix res = new Matrix(a.rows,b.cols);
        for (int i=0;i<a.rows;i++){

            for (int k=0;k<b.cols;k++){
                ComplexNumbers summ = new ComplexNumbers(0);
                for (int j=0;j<a.cols;j++) {
                    summ = ComplexNumbers.sum(summ, ComplexNumbers.mult(a.complexarr[i][j], b.complexarr[j][k]));
                }
                res.complexarr[i][k] = summ;
            }
        }
        return res;
    }

    public void transpon(){
        Matrix res = new Matrix(this.cols,this.rows);
        for (int i=0;i<this.rows;i++){
            for (int j=0;j<this.cols;j++){
                res.complexarr[j][i] = this.complexarr[i][j];
            }
        }
        this.cols= res.cols;
        this.rows = res.rows;
        this.complexarr= res.complexarr;;

    }
    public void print(){
        System.out.print("[");
        for (int i=0;i<this.rows;i++){
            for (int j=0;j<this.cols;j++){
                complexarr[i][j].print();
                if (j<this.cols-1) System.out.print(",  ");
            }
            if (i==this.rows-1) System.out.print("]");
            System.out.print("\n");
        }
    }
}
