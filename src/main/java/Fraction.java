public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {

        this.numerator = numerator;
        
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }
}
