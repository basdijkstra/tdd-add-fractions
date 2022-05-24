import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FractionTest {

    @Test
    public void aFraction_cannotHaveAZeroDenominator() {

        Assertions.assertThrows(IllegalArgumentException.class, () ->  {
            Fraction fraction = new Fraction(2, 0);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "1, 5, 2, 5, 3, 5",
            "-1, 5, -2, 5, -3, 5"
    })
    public void addFractions_sameDenominator_noSimplification(
            int numeratorOne, int denominatorOne, int numeratorTwo,
            int denominatorTwo, int numeratorResult, int denominatorResult
    ) {

        Fraction fraction1 = new Fraction(numeratorOne, denominatorOne);
        Fraction fraction2 = new Fraction(numeratorTwo, denominatorTwo);

        Fraction resultFraction = fraction1.add(fraction2);

        Assertions.assertEquals(numeratorResult, resultFraction.getNumerator());
        Assertions.assertEquals(denominatorResult, resultFraction.getDenominator());
    }

    @Test
    public void addFractions_negativeNumerators_noSimplification() {

        Fraction fraction1 = new Fraction(-1, 5);
        Fraction fraction2 = new Fraction(-2, 5);

        Fraction resultFraction = fraction1.add(fraction2);

        Assertions.assertEquals(-3, resultFraction.getNumerator());
        Assertions.assertEquals(5, resultFraction.getDenominator());
    }
}
