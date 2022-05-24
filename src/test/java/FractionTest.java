import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionTest {

    @Test
    public void aFraction_cannotHaveAZeroDenominator() {

        Assertions.assertThrows(IllegalArgumentException.class, () ->  {
            Fraction fraction = new Fraction(2, 0);
        });
    }
}
