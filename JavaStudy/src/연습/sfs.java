package ����;

import java.util.Scanner;

public class sfs { 
	 public static void main(String[] args) {
		 int score = 0;

		 System.out.print("���� �Է� > ");

		 Scanner scan = new Scanner(System.in);
		 score = scan.nextInt();

		 char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C') ;

		 System.out.println(grade);

		 scan.close();
		 }


}
