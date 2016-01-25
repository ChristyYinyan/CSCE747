package test1Part2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTestCase {

	public WeekTime stdSt = new WeekTime("T", "08:30", "am");
	public WeekTime stdFh = new WeekTime("T", "09:45", "am");
	public Course std = new Course("CSCE", 747, "Prof.Manton Matthews", stdSt,
			stdFh);

	// String d, int num, String instr, WeekTime st, WeekTime fh

	@Test
	public void checkCourseTime() {
		String d = std.getDept();
		int num = std.getNumber();
		String instr = std.getInstructor();
		System.out.println("Here is the standard course: " + " " + d + " "
				+ num + " " + instr + " " + stdSt + " " + stdFh);

		// overlapped case
		WeekTime badSt = new WeekTime("T", "08:50", "am");
		WeekTime badFh = new WeekTime("T", "09:45", "am");

		Course badCase = new Course("CSCE", 750, "Prof.Fenner", badSt, badFh);

		int bad = std.compare(badCase);
		assertEquals("These two courses are overlapped, not allowed ", -1, bad);

		// Appropriate case
		WeekTime goodSt = new WeekTime("T", "10:50", "am");
		WeekTime goodFh = new WeekTime("T", "11:45", "am");

		Course goodCase = new Course("CSCE", 750, "Prof.Fenner", goodSt, goodFh);

		int good = std.compare(goodCase);
		assertEquals("These two courses are good", 1, good);

		// The same case
		WeekTime sameSt = new WeekTime("T", "08:30", "am");
		WeekTime sameFh = new WeekTime("T", "09:45", "am");

		Course sameCase = new Course("CSCE", 750, "Prof.Fenner", sameSt, sameFh);

		int same = std.compare(sameCase);
		assertEquals("They are the same time!!!", 0, same);

	}

}
