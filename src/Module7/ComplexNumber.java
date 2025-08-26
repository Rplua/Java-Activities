package Module7;

public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for real part
    public double getReal() {
        return real;
    }

    // Getter for imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Adds values directly
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Adds another ComplexNumber
    public void add(ComplexNumber other) {
        this.real += other.getReal();
        this.imaginary += other.getImaginary();
    }

    // Subtracts values directly
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Subtracts another ComplexNumber
    public void subtract(ComplexNumber other) {
        this.real -= other.getReal();
        this.imaginary -= other.getImaginary();
    }
}
