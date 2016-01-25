package test1Part2;

import static org.junit.Assert.*;

import org.junit.Test;

//compare two times and return a value strcmp

public class WeekTimeTestCase {
	public WeekTime std = new WeekTime("T", "02:30", "am");

	@Test
	public void checkWeekTime() {
		System.out.println("Here is the standard time: " + std);

		// less case
		WeekTime less = new WeekTime("T", "02:10", "am");
		System.out.println("Here is the less case input: ");
		System.out.println(less);
		int les = std.compare(less);
		assertEquals("It is less than the standard time, not allowed ", -1, les);

		// greater case
		WeekTime greater = new WeekTime("T", "02:50", "pm");
		System.out.println("Here is the greater case input: ");
		System.out.println(greater);
		int grt = std.compare(greater);
		assertEquals("It is greater than the standard time, allowed ", 1, grt);

		// equal case
		WeekTime equal = new WeekTime("T", "02:30", "am");
		System.out.println("Here is the equal case input: ");
		System.out.println(equal);
		int eql = std.compare(equal);
		assertEquals("There are the same!", 0, eql);

	}

}
