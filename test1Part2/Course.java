package test1Part2;

public class Course {
	private String dept;
	private int number;
	public String instructor;
	private WeekTime start;
	private WeekTime finish;
	private String courseName;

	public Course(String d, int num, String instr, WeekTime st, WeekTime fh) {
		dept = d;
		number = num;
		instructor = instr;
		start = st;
		finish = fh;
	}

	// new constructor for just taking a name
	public Course(String courseName) {
		courseName = dept + (String)Integer.toString(number);
	}

	// find professor
	public String findProfessor(String courseName) {
		String professor = instructor;
		return professor;
	}

	// find start time
	public String findStartT(String courseName) {
		String startT = start.hour + ":" + start.min;
		return startT;
	}

	// find professor
	public String findFinishT(String courseName) {
		String finishT =finish.hour + ":" + finish.min;
		return finishT;
	}

	public int compare(Course crs) {
		WeekTime strFh = this.finish;
		WeekTime curFh = crs.getFinish();
		WeekTime strSt = this.start;
		WeekTime curSt = crs.getStart();

		if (strFh.compare(curFh) == 0 && strSt.compare(curSt) == 0) {
			return 0;
		} else if ((strSt.compare(curSt) == -1 && strSt.compare(curFh) == 1)
				|| (strSt.compare(curSt) == 1 && strFh.compare(curSt) == -1)) {
			return -1;
		} else {
			return 1;
		}
	}

	public String toString() {
		String str;
		// str = "CSCE" + "109" + "Matthews";
		str = dept + Integer.toString(number) + instructor;
		return str;
	}

	public WeekTime getFinish() {
		return finish;
	}

	public WeekTime getStart() {
		return start;
	}

	public String getDept() {
		return dept;
	}

	public int getNumber() {
		return number;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setFinish(WeekTime finish) {
		this.finish = finish;
	}
}
