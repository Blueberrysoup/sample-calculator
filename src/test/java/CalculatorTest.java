import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {

	public static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calc = new Calculator();
	Random random = new Random();
	
	@Test
	public void testAdd_smallPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000)/100.00;
			expected = rand1 + rand2;
			LOG.info("Testing the add method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.add(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testAdd_mediumPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 10000)/100.00;
			rand2 = Math.round(random.nextDouble() * 10000)/100.00;
			expected = rand1 + rand2;
			LOG.info("Testing the add method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.add(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testAdd_largePositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000000)/100.00;
			expected = rand1 + rand2;
			LOG.info("Testing the add method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.add(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testAdd_zero() {
		double expected = 0.0 + 0.0;
		LOG.info("Testing the add method with 0 + 0");
		assertEquals(expected, calc.add(0, 0), 0.01);
	}

	@Test
	public void testAdd_smallNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000)/100.00;
			expected = rand1 + rand2;
			LOG.info("Testing the add method with: " + rand1 + " and " + rand2);
			if (i == 136)
				assertEquals(expected, calc.add(rand1, rand2), 0.01);
			else	
				assertEquals(expected, calc.add(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testAdd_mediumNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -10000)/100.00;
			rand2 = Math.round(random.nextDouble() * -10000)/100.00;
			expected = rand1 + rand2;
			LOG.info("Testing the add method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.add(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testAdd_largeNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000000)/100.00;
			expected = rand1 + rand2;
			LOG.info("Testing the add method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.add(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testSubtract_smallPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000)/100.00;
			expected = rand1 - rand2;
			LOG.info("Testing the subtract method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.subtract(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testSubtract_mediumPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 10000)/100.00;
			rand2 = Math.round(random.nextDouble() * 10000)/100.00;
			expected = rand1 - rand2;
			LOG.info("Testing the subtract method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.subtract(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testSubtract_largePositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000000)/100.00;
			expected = rand1 - rand2;
			LOG.info("Testing the subtract method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.subtract(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testSubtract_zero() {
		double expected = 0.0 - 0.0;
		LOG.info("Testing the subtract method with 0 - 0");
		assertEquals(expected, calc.subtract(0, 0), 0.01);
	}

	@Test
	public void testSubtract_smallNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000)/100.00;
			expected = rand1 - rand2;
			LOG.info("Testing the subtract method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.subtract(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testSubtract_mediumNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -10000)/100.00;
			rand2 = Math.round(random.nextDouble() * -10000)/100.00;
			expected = rand1 - rand2;
			LOG.info("Testing the subtract method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.subtract(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testSubtract_largeNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000000)/100.00;
			expected = rand1 - rand2;
			LOG.info("Testing the subtract method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.subtract(rand1, rand2), 0.01);
		}	
	}
	
	@Test
	public void testMultiply_smallPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000)/100.00;
			expected = rand1 * rand2;
			LOG.info("Testing the multiply method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.multiply(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testMultiply_mediumPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 10000)/100.00;
			rand2 = Math.round(random.nextDouble() * 10000)/100.00;
			expected = rand1 * rand2;
			LOG.info("Testing the multiply method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.multiply(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testMultiply_largePositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000000)/100.00;
			expected = rand1 * rand2;
			LOG.info("Testing the multiply method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.multiply(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testMultiply_zero() {
		double expected = 0.0 * 0.0;
		LOG.info("Testing the multiply method with 0 * 0");
		assertEquals(expected, calc.multiply(0, 0), 0.01);
	}

	@Test
	public void testMultiply_smallNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000)/100.00;
			expected = rand1 * rand2;
			LOG.info("Testing the multiply method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.multiply(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testMultiply_mediumNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -10000)/100.00;
			rand2 = Math.round(random.nextDouble() * -10000)/100.00;
			expected = rand1 * rand2;
			LOG.info("Testing the multiply method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.multiply(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testMultiply_largeNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000000)/100.00;
			expected = rand1 * rand2;
			LOG.info("Testing the multiply method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.multiply(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testDivide_smallPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000)/100.00;
			expected = rand1 / rand2;
			LOG.info("Testing the divide method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.divide(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testDivide_mediumPositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 10000)/100.00;
			rand2 = Math.round(random.nextDouble() * 10000)/100.00;
			expected = rand1 / rand2;
			LOG.info("Testing the divide method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.divide(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testDivide_largePositive() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * 1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * 1000000)/100.00;
			expected = rand1 / rand2;
			LOG.info("Testing the divide method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.divide(rand1, rand2), 0.01);
		}	
	}

/*	@Test
	public void testDivide_zero() {
		double expected = 0;
		LOG.info("Testing the subtract method with 0 / 0");
		assertEquals(expected, calc.divide(0, 0), 0.01);
	}*/

	@Test
	public void testDivide_smallNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000)/100.00;
			expected = rand1 / rand2;
			LOG.info("Testing the divide method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.divide(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testDivide_mediumNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -10000)/100.00;
			rand2 = Math.round(random.nextDouble() * -10000)/100.00;
			expected = rand1 / rand2;
			LOG.info("Testing the divide method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.divide(rand1, rand2), 0.01);
		}	
	}

	@Test
	public void testDivide_largeNegative() {
		double rand1 = 0;
		double rand2 = 0;
		double expected = 0;
		
		for (int i = 0; i < 200; i++) {
			rand1 = Math.round(random.nextDouble() * -1000000)/100.00;
			rand2 = Math.round(random.nextDouble() * -1000000)/100.00;
			expected = rand1 / rand2;
			LOG.info("Testing the divide method with: " + rand1 + " and " + rand2);
			assertEquals(expected, calc.divide(rand1, rand2), 0.01);
		}	
	}
}
