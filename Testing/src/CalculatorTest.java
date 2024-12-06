import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculater calc;
	
	@BeforeEach
	void setup() {
		calc = new Calculater();
	}
	
	@Test
	void testAdd() {
		assertEquals(0, calc.add(0, 0), "Addition did not work correctly");
	}
	
	@Test
	void testMultiply() {
		assertTrue(calc.multiply(6, 5) == 30, "Answer of 6 * 5 is not 30");
	}
}
