package ch04;

//package ch04;
////1000 ������ �ڿ��� �߿��� 2�� ����̸鼭 7�� ����� ���ڸ� ���
////��µ� ���ڵ��� ���� ���ϴ� �ڵ� �ۼ�
//public class Exam4_4_2 { public static void main(String[] args) {
//	int sum = 0;
//			for(int i = 1; i <= 1000; i++) {
//				if(i % 2 == 0 && i % 7 == 0) {
//					sum += i;
//					System.out.println(i);
//					
//				}
//				
//			}
//			
//			System.out.println(sum);
//}
//
//}

//for(int a =5; a>=1;a--) {
//	
//
//	for(int b=a;b>=1;b--) {
//	
//		System.out.print("��");
//	}
//	System.out.println();
//}
//
//}
//
//}

\


public class Star2 {
	public static void main(String[] args) {
		
		int i=0;
				int j =0;
				int space=5-i; 
				
		for(int i = 5; i>=1;i--) {
			for(int j=1;j<=i;j++) {
				int space=5-i; 
			if(j>space) {
				System.out.print("����");
			} else {
				System.out.print("��");
			}
			}
		}
		System.out.println();
	}

}


--------------------

public static void main(String[] args) {

	 

	for (int i = 1; i <= 5; i++) {



		int space = 5 - i;// i=1 space=4



		for (int j = 1; j <= 5; j++) {

			if (j <= space) {

				System.out.print(" ");

			} else {

				System.out.print("*");

			}



		}

		System.out.println();

	}

}

