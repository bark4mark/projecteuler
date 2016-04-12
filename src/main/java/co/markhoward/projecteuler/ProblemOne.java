package co.markhoward.projecteuler;

/**
 * Project Euler, problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class ProblemOne {

	public static int sumOfMultiples(int subject, int... multiples) {
		int result = 0;
		for(int index = 0; index < subject; index++)
			if(multipleOf(index, multiples))
				result = result + index;
		return result;
	}
	
	private static boolean multipleOf(int index, int[] multiples){
		for(int multiple: multiples)
			if(index % multiple == 0)
				return true;
		return false;
	}
	
}
