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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction fractionToAdd) {

        return new Fraction(
               this.numerator + fractionToAdd.getNumerator(),
               this.denominator
        );
    }
}
