import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
	@Test
	public void addNegative() {
		assertThrows(RuntimeException.class, () -> StringCalculator.add("-1, 5"));
	}

	@Test
	public void addThousand0() {
		assertEquals(1, StringCalculator.add("1, 1000"));
	}

	@Test
	public void addThousand1() {
		assertEquals(0, StringCalculator.add("1000"));
	}
}
