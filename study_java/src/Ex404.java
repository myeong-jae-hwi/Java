
public class Ex404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  3. �� ������(<,<=,>,>=,==,!=)
 */
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result41 = (num1 == num2);
		System.out.println("result41 = " + result41);
		
		boolean result42 = (num1 != num2);
		System.out.println("result42 = " + result42);
		
		boolean result43 = (num1 <= num2);
		System.out.println("result43 = " + result43);
		
		double v11 = 0.1;
		float v12 = 0.1f;
		
		System.out.println("v11 == v12 : " + (v11 == v12));
		System.out.println("(float)v11 == v12 : " + ((float)v11 == v12));
		System.out.println();
		System.out.println();
		
/*
   ���ڿ� ��
 */
		String strVar21 ="ȫ�浿";
		String strVar22 ="ȫ�浿";
		String strVar23 = new String("ȫ�浿");
		
		System.out.println("strVar21 == strVar22 : " + (strVar21 == strVar22));
		System.out.println("strVar21 == strVar23 : " + (strVar21 == strVar23));
		System.out.println();
		System.out.println("strVar21.equals(strVar22) : " + strVar21.equals(strVar22));
		System.out.println("strVar21.equals(strVar22) : " + strVar21.equals(strVar23));
		
		
/*
  4. �� ������(&&, ||, &, |, ^, !)
 */
		
		int charCode = 'A';
		
		if( (charCode >= 65) && (charCode <=90) ) {
			System.out.println("�빮�� �Դϴ�.");		
		}
		else {
			
		System.out.println("��!!!");
		}
		
		System.out.println();
		
		if( (charCode >= 65) || (charCode <=90) ) {
			System.out.println("�빮�� �Դϴ�.");		
		}
		else {
			
		System.out.println("��!!!");
		}
		
		System.out.println();
		
		if( (charCode >= 65) & (charCode <=90) ) {
			System.out.println("�빮�� �Դϴ�.");		
		}
		else {
			
		System.out.println("��!!!");
		}
		
		System.out.println();
		
		int valueCode = 6;
		
		if( (valueCode == 0) || (valueCode > 5)  ) {
			System.out.println("���� �Դϴ�.");
		}
		else {
			System.out.println("��!!!");
		}
		


/*
  5. ��Ʈ ������ (&, |, ^, ~, <<, >>, >>>)
   AND(����) : &  => �� ��Ʈ ��� 1�� ��쿡�� ���� ����� 1
   OR(����) : | => �� ��Ʈ �� �ϳ��� 1�̸� ���� ����� 1
   XOR(��Ÿ������) : ^ => �� ��Ʈ �� �ϳ��� 1�̰� �ٸ� �ϳ��� 0�� ��� ���� ����� 1
   NOT(�� ����) : ~ => ����
   
   	 00001101  A
   	 10101010  B
   	 ========
   	 00001000 (����)
   	 10101111 (����)
   	 10100111 (��Ÿ�� ����)
   	 11110010 (~A)
   	 01010101 (~B)
 */
		
		System.out.println();
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("~25 = " + (~25));
		
/*
  ��Ʈ �̵� ������(<<, >>, >>>)
  
  �����									����
  =========================================================================================
  a << b		���� a�� �� ��Ʈ�� b��ŭ �������� �̵�(���ڸ��� 0���� ä������)
  a >> b		���� a�� �� ��Ʈ�� b��ŭ ���������� �̵�(���ڸ��� ���� a�� �ֻ��� ��ȣ ��Ʈ�� ���� ������ ä������.)
  a >>> b		���� a�� �� ��Ʈ�� b ��ŭ ���������� �̵�(���ڸ��� 0���� ä������.)
 */
		
		System.out.println("1 << 3 : " + (1<<3));
		System.out.println("-8 >> 3 : " + (-8 >> 3));
		System.out.println("-8 >>> 3 : " + (-8 >>> 3));
		System.out.println();
		
		
/*
  6. ���� ������(=, +=, -=, &=, *=)
 */
		int result51 = 0;
		result51 += 10; // result51 = result51 + 10;		 
		System.out.println("result51 = " + result51);
		System.out.println();
		System.out.println();
	}
}
