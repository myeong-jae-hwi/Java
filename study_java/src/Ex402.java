
public class Ex402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 ���� ������
  1. ��ȣ ������(+, -)
  
  �����			����
  +		�ǿ�����	�ǿ������� ��ȣ ����
  -		�ǿ�����	�ǿ������� ��ȣ ����
 */
	
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = "+ result1); // +(-100)
		System.out.println("result2 = "+ result2); // -(-100)
		System.out.println();
		
/*
  	2.���� ������(++, --)
  		�����				����
  	++	�ǿ�����		�ٸ� ������ �����ϱ� ���� �ǿ������� ���� 1������Ŵ
  	--	�ǿ�����		�ٸ� ������ �����ϱ� ���� �ǿ������� ���� 1���ҽ�Ŵ
  	�ǿ�����	++		�ٸ� ������ ������ �� �ǿ������� ���� 1������Ŵ
  	�ǿ�����	--		�ٸ� ������ ������ �� �ǿ������� ���� 1���ҽ�Ŵ
 */
	
		int x1 = 10;
		int y1 = 10;
		int z;
		
		++x1;
		System.out.println("++x1 = " + x1);
		
		y1--;
		System.out.println("++y1 = " + y1);
		
		z = x1-- + ++y1;
		System.out.println("x1 = " + x1 + ", y1 = " + y1 );
		System.out.println("x1-- + ++y1 = " + z);
		System.out.println();
		
/*
  3. �� ���� ������(!)
  
  	�����			����
  	! �ǿ�����			�ǿ����ڰ� true�̸� false ���� ����
  					�ǿ����ڰ� false�̸� true ���� ����
 */
		
		boolean play = true;
		
		System.out.println("play = " + play);
		
		play = !play;
		
		System.out.println("!play = " + play);
		
/*
  4. ��Ʈ ���� ������(~)
 */
		
		int b1 = 10;
		int b2 = ~b1;
		
		System.out.println("b1 = " + b1); // 00001010
		System.out.println("b2 = " + b2); // 11110110
		System.out.println();
		
	}

}
