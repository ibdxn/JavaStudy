package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		 int count = 0;
	 for(int i = 1; i <= 301; i++) { 
		
		 int num = i;
		 while(num>0)
		 {
			 int n = num % 10;
			 if(n == 3) {
				 System.out.println(i);
				 count++;
				 break;
			 }
			num= num / 10;
		 }
	 // �ڵ� �ۼ�
		 
//		 1 ~ 1000 ������ ���� �� 3�� �����ϰ� �ִ� ���ڸ� ���

			} System.out.println(count);
	 }		

}
