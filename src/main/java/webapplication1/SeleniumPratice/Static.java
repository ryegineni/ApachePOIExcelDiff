package webapplication1.SeleniumPratice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Static {
	static int rollno = 0;
	String name;
	String college = "ITS";
	static {
		System.out.println("jdjff");
	}

	Static() {
		rollno++;
		System.out.println(rollno);
		// name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
	}
}
