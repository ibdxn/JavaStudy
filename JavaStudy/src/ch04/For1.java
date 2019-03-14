package ch04;

public class For1 { public static void main(String[] args) {
	int total = 0;
	int realTotal = 0;
	
	for(int start = 1; start <= 10; start++) {
//	System.out.println("출력" + start);
total = total + start;
realTotal = realTotal + total;
}
	System.out.println(realTotal);
	
//	for(int start = 1; start <= 10; start++) {
////		System.out.println("출력" + start);
//	total = total + start;
//	System.out.println(total);
//	}

	//1.시작값 2.끝값(조건)3.증감식
//
//for (int end = 10; end >= 1; end--) {System.out.println("감소출력" + end);}


//System.out.println("출력");
//System.out.print("한줄출려");
//System.out.print("또");
//System.err.println("에러츌럭");

}
}
