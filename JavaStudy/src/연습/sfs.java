package 연습;

public class sfs { 
	 public static void main(String[] args) {
		 int sum = 0;
		 for(int i = 1; i <= 10; i++) {
		 if(i % 2 != 0) {
		 sum += i; // sum = sum + i;
		 System.out.print("i의 값 => " + i);
		 System.out.println(" sum의 값 => " + sum);
		 }
		 }
		 System.out.println("최종 sum의 값 => " + sum);
		 }


}
