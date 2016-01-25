package test1Part2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructorTestCase {
	public WeekTime stdSt = new WeekTime("T", "08:30", "am");
	public WeekTime stdFh = new WeekTime("T", "09:45", "am");
	public Course std = new Course("CSCE", 747, "Prof.Manton Matthews", stdSt,
			stdFh);

	public void equalTest() {
		String d = std.getDept();
		int num = std.getNumber();
		String instr = std.getInstructor();
		System.out.println("Here is the standard course: " + " " + d + " "
				+ num + " " + instr + " " + stdSt + " " + stdFh);
		assertEquals("Dept, num, Instructor are matched?", d + num + instr,
				"CSCE" + 747 + "Prof.Manton Matthews");
		assertEquals("Start time is matched?", stdSt.day + stdSt.hour
				+ stdSt.min, "T" + "08:30" + "am");
		assertEquals("Finish time is matched?", stdFh.day + stdFh.hour
				+ stdFh.min, "T" + "09:45" + "am");
	}

}
