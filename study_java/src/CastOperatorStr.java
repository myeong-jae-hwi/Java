
public class CastOperatorStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	@	����ȯ�� ĳ��Ʈ ������
	int a;
	a=3.5;
	
	����ȯ : ���� �����ڸ� �ΰ� �ڷ� Ÿ���� ���� �ٸ� �� ���� ������ �������� �ڷ� Ÿ���� ���ʿ� ����
			������ �ڷ� Ÿ�Կ� ���߾ �ڷ� Ÿ�� ����
			
	�⺻�ڷ� - double > float > long > int > char
	
	
	ĳ��Ʈ ������
	
	int a = (int)3.5;
			(�ڷ�Ÿ��)��
		
		 */
		
		char ch01 = 'A';
		char ch02 = '\u0041';
		char ch03 = '\0';
		char ch04 = ' ';
		
		int intVar01 = ch01;
		int intVar02 = ch02;
		int intVar03 = ch03;
		int intVar04 = ch04;
		
		System.out.println("���� "+ch01 +"�� �����ڵ� :" + intVar01);
		System.out.println("���� "+ch02 +"�� �����ڵ� :" + intVar02);
		System.out.println("���� "+ch03 +"�� �����ڵ� :" + intVar03);
		System.out.println("���� "+ch04 +"�� �����ڵ� :" + intVar04);
		
		System.out.println("���� "+ (char)('A'+1) + "�� �����ڵ� :" + ('A'+1));
		
		String str01 = "��";
		String str02 = "����";
		boolean b01 = true;
		boolean b02 = false;
		
		System.out.println(str01 + " : " + b01);
		System.out.println(str02 + " : " + b02);
		
	}

}
