import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
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
		for (int i = 0; i < 200; i++) {
			double expected = 0.0 + 0.0;
			LOG.info("Testing the add method with 0 + 0");
			assertEquals(expected, calc.add(0, 0), 0.01);
		}	
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
}
