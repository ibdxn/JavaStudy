package ch04;

import java.util.Calendar;

public class ifTest4_3 {
	public static void main(String[] args) {
		/*
		 * �����̸� '�����Դϴ�', '����Դϴ�' ��� ��� ��) year = 1904 '�����Դϴ�' year = 2000 '�����Դϴ�' year =
		 * 2200 '����Դϴ�' year = 1997 '����Դϴ�'
		 */

		int year = 2019; // ����

		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("�����Դϴ�");
		} else if (year % 100 == 0) {
			System.out.println("����Դϴ�");
		} else {
			System.out.println("����Դϴ�");
		

		}

	}
}
