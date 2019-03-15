package ch06;

public class MethodExam2 {
	 public static void main(String[] args) {
	 String result = printStar(5, '¡Ú');
	 System.out.println(result);
	 }
	 public static String printStar(int count, char ch) {
	 String star = "";
	 for(int i = 1; i <= count; i++) {
	 for(int j = 1; j <= i; j++) {
	 star = star + ch;
	 }
	 star = star + "\n";
	 }
	 return star;
	 }
	}