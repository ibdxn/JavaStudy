package ch05;

public class Exam5_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		int sum = 0;
		int count = 0;

		/* �ε����� 2�� ����� ��쿡�� �� �Է� */
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = i + 10; // 10 12 14 16 18
				if(arr[i]>0) {
				sum += arr[i];
//				sum = sum +arr[i]
				count++;
                  			}
		}

		float avg = 0f;
		avg= (float) sum/count;
		
		// �ڵ��ۼ�

		System.out.println("�� : " + sum);
		System.out.println("��� : " + avg);
	}
}}

//���� 0�� �ƴ� �迭����� �հ� ����� ���ϴ� �ڵ� �ۼ�
//��70
//��Ŧ 14�� ������
