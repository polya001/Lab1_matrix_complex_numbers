public class ComplexNumbers {
    private double real, imag;

    ComplexNumbers(){
        real=0;
        imag=0;
    }
    ComplexNumbers(double real1){
        real=real1;
        imag=0;
    }
    ComplexNumbers(double real1,double imag1){
        real=real1;
        imag=imag1;
    }
    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void print(){
        if (imag<0) System.out.print(real + " - " + Math.abs(imag) + "i");
        else if (imag>0) System.out.print(real + " + " + imag + "i");
        else System.out.print(real);
    }
    public static ComplexNumbers sum(ComplexNumbers a, ComplexNumbers b){
        return new ComplexNumbers(a.getReal()+ b.getReal(),a.getImag()+b.getImag());
    }
    public static ComplexNumbers diff(ComplexNumbers a, ComplexNumbers b){
        return new ComplexNumbers(a.getReal()- b.getReal(),a.getImag()-b.getImag());
    }

    public static ComplexNumbers mult(ComplexNumbers a, ComplexNumbers b){
        return new ComplexNumbers(a.real * b.real - a.imag*b.imag,a.real*b.imag + a.imag*b.real);
    }
    public static ComplexNumbers div(ComplexNumbers a, ComplexNumbers b){
        if (b.real==0 && b.imag==0){ System.out.print("\nMath error: You can't divide by 0"); return new ComplexNumbers();}
        return new ComplexNumbers((a.real * b.real + a.imag*b.imag)/(b.real*b.real + b.imag*b.imag),(a.imag*b.real - a.real*b.imag )/(b.real*b.real + b.imag*b.imag));
    }

    
}
