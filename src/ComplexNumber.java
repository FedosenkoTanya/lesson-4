/**
 * Created by Stud on 20.09.2018.
 */

public class ComplexNumber {
    private int real;
    private int imaginary;



    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }


    public static ComplexNumber sum(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getReal()+b.getReal(), a.getImaginary()+b.getImaginary());
    }

    public static ComplexNumber min(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getReal()-b.getReal(), a.getImaginary()-b.getImaginary());
    }

    public static ComplexNumber mul(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getReal()*b.getReal()-a.getImaginary()*b.getImaginary(), a.getReal()*b.getImaginary()+a.getImaginary()*b.getReal());
    }


    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }


    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}
