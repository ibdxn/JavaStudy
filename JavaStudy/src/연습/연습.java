package ����;

public class ���� {
	public static void main(String[] args) {
		returnValue(); /* �޼ҵ常 ȣ�� */
		int value = returnValue(); /* �޼ҵ� ȣ�� �� ��ȯ�Ǵ� �� ������ ���� */
//	 String result = returnValue(); /* ���Ұ� - ����Ÿ�� */
//	 returnValue("100"); /* ���Ұ� - �Ű����� */
	}

	public static int returnValue() {
		System.out.println("�޼ҵ� ����");
		return 0; /* �޼ҵ��� ��ȯŸ�԰� �ݵ�� ���ƾ� �� */
	}
}
