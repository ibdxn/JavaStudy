package ch04;

public class ifTest4_2 {
		 public static void main(String[] args) {
			 
		// score�� 2�� ����� ��� ��¦��, 3�� ����� ��� ������, 2�� ����̸鼭 3�� ����� ��� ����¦��,
		// �� ���� ���� score�� ��µǵ��� �ڵ� �ۼ�	
			 
		 int score = 24;
		 
		 if (score %2 ==0 && score %3 ==0) {
			 System.out.println("��¦");
		 } else if (score %2 ==0) {
			 System.out.println("¦");
		 } else if (score %3 ==0) {
			 System.out.println("��"); 
		 }
	 }
}

