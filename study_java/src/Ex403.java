
public class Ex403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ���� ������
  1. ��� ������(+,-,*,/,%)
 */
		
		int x2 = 5;
		int y2 = 2;
		
		int result21 = x2 + y2;
		System.out.println("x2 + y2 = " + result21);
		int result22 = x2 - y2;
		System.out.println("x2 - y2 = " + result22);
		int result23 = x2 * y2;
		System.out.println("x2 * y2 = " + result23);
		int result24 = x2 / y2;
		System.out.println("x2 / y2 = " + result24);
		int result25 = x2 % y2;
		System.out.println("x2 % y2 = " + result25);
		System.out.println();
/*
  char Ÿ�� ����
 */
		char c1 = ('A' + 8);
		char c2 = 'B';
		char c3 = (char)(c1 + c2);
		System.out.println("'A'+8 = " + c1);
		System.out.println("(char)(c1+c2) = " + c3);
		
/*
   �����÷ο� Ž��
 */
		
		int x31 = 1500000000;
		int y31 = 1000000000;
		
		int z31 = x31 + y31;
		
		System.out.println("x31+y31 = " + z31);
		
/*
  �����÷ο� �ذ�
 */
				
		long x32 = 150000000000L;
		long y32 = 100000000000L;
		
		long z32 = x32 + y32;
				
		System.out.println("x32+y32 = " + z32);
				
/*
   ��Ȯ�ϰ� ����� ������ �ε��Ҽ��� Ÿ���� ������� �ʴ´�.
   �� : ��� 1���� 0.1 ���� 10�������� ����, �� �� 7����(0.7)�� �� 3����(0.3)�� result������ �����Ѵ�.
   		result�� ����� 0.3�� ���̴�.
 */
		
// �߸��� ��
	int apple = 1;
	double pieceUnit = 0.1;
	int number = 7;
	
	double result31 = apple - number*pieceUnit;
	
	System.out.println("��� �Ѱ�����");
	System.out.println("0.7 ������ ����");
	System.out.println(result31 + "������ ���´�.");
	
// �ùٸ� ��
	int apple1 = 1;
	int number1 = 7;
	int totalPieces = apple1 * 10;
	int temp = totalPieces - number1;
	
	double result32 = temp/10.0;
	
	System.out.println("��� �Ѱ�����");
	System.out.println("0.7 ������ ����");
	System.out.println(result32 + "������ ���´�.");
	
/*
   2. ���ڿ� ���� ������(+)
 */
	
	String str1 = "�ڹ�" + 3 + 15.0;
	String str2 = " ���α׷���";
	
	System.out.println("str1 + str2 = " + (str1 + str2));
	}

}
