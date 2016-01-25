package test1Part2;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class HasToStringHamcrestTestCase {

	@Test
	//TestCase1
	public void test1() {
		String s = "01:10";
		String ap="pm";
		String e = "M";
		WeekTime wt = new WeekTime(e, s, ap);
		System.out.println(wt);
		assertThat(wt, hasToString("M 13:10"));
	}
	
	@Test
	//TestCase2
	public void test2() {
		String s = "09:30";
		String ap="am";
		String e = "T";
		WeekTime wt = new WeekTime(e, s, ap);
		System.out.println(wt);
		assertThat(wt, hasToString("T 09:30"));
	}
}
