package ch05;

public class Exam5_4 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int count = 0;
		// �ڵ� �ۼ�
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				count++;
		arr[i][j] = count;
		/* �Էµ� ���� ��� */

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

//for (int i = 0; i < bingo.length; i++) {
//	bingo[i] = i + 1;
