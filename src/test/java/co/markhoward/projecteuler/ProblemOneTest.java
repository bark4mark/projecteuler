package co.markhoward.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class ProblemOneTest {
	@Test
	public void shouldGetTheSumOfTheMultiplesOfThreeAndFiveUnderTen(){
		Assert.assertTrue(ProblemOne.sumOfMultiples(10, 3, 5) == 23);
	}
	
	@Test
	public void shouldGetTheSumOfTheMultiplesOfThreeAndFiveUnderAThousand(){
		System.out.println(String.format("The answer to problem 1 is: %d", ProblemOne.sumOfMultiples(1000, 3, 5)));
	}
}
