package test1Part2;

import java.util.*;

public class WeekTime {

	public String day;
	public String hour;
	public String min;
	public static Map<Character, Integer> dateDic = new HashMap<Character, Integer>();
	// constructor
	public WeekTime(String day, String time, String ampm) {
		split(time,ampm);
		this.day = day;
		dateDic.put('M', 1);
		dateDic.put('T', 2);
		dateDic.put('W', 3);
		dateDic.put('R', 4);
		dateDic.put('F', 5);
	}

	

	public int compare(WeekTime time) {
		if (time.day.equals(this.day)) {
			if (time.hour.equals(this.hour) && time.min.equals(this.min))
				return 0;
			else if (time.hour.equals(this.hour)) {
				if (Integer.parseInt(time.min) > Integer.parseInt(this.min)) {
					return 1; // this time zone is okay
				} else {
					return -1;
				}
			} else {
				if (Integer.parseInt(time.hour) > Integer.parseInt(this.hour)) {
					return 1;
				} else {
					return -1;
				}
			}
		} else {
			if(dateDic.get(time.day) >dateDic.get(this.day) ){
				return 1;
			}else{
				return -1; 
			}

		}

	}

	public void split(String tmp,String ampm) {
		this.hour = tmp.substring(0, 2);
		this.min = tmp.substring(3, 5);

		if (ampm.charAt(0) == 'p') {
			this.hour = Integer.toString(Integer.parseInt(hour) + 12);
		}
	}

	public String toString() {

		return day + " " + hour + ":" + min;
	}

}
