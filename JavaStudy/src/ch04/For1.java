package ch04;

public class For1 { public static void main(String[] args) {
	int total = 0;
	int realTotal = 0;
	
	for(int start = 1; start <= 10; start++) {
//	System.out.println("���" + start);
total = total + start;
realTotal = realTotal + total;
}
	System.out.println(realTotal);
	
//	for(int start = 1; start <= 10; start++) {
////		System.out.println("���" + start);
//	total = total + start;
//	System.out.println(total);
//	}

	//1.���۰� 2.����(����)3.������
//
//for (int end = 10; end >= 1; end--) {System.out.println("�������" + end);}


//System.out.println("���");
//System.out.print("�������");
//System.out.print("��");
//System.err.println("��������");

}
}
