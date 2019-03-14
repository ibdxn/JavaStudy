package ch04;

import java.util.Calendar;

public class ifTest4_3 {
	public static void main(String[] args) {
		/*
		 * 윤년이면 '윤년입니다', '평년입니다' 라고 출력 예) year = 1904 '윤년입니다' year = 2000 '윤년입니다' year =
		 * 2200 '평년입니다' year = 1997 '평년입니다'
		 */

		int year = 2019; // 연도

		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("윤년입니다");
		} else if (year % 100 == 0) {
			System.out.println("평년입니다");
		} else {
			System.out.println("평년입니다");
		

		}

	}
}
