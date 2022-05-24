import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionTest {

    @Test
    public void aFraction_cannotHaveAZeroDenominator() {

        Assertions.assertThrows(IllegalArgumentException.class, () ->  {
            Fraction fraction = new Fraction(2, 0);
        });
    }

    @Test
    public void addFractions_sameDenominator_noSimplification() {

        Fraction fraction1 = new Fraction(1, 5);
        Fraction fraction2 = new Fraction(2, 5);

        Fraction resultFraction = fraction1.add(fraction2);

        Assertions.assertEquals(3, resultFraction.getNumerator());
        Assertions.assertEquals(5, resultFraction.getDenominator());
    }
}
