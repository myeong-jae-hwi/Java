
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 @ �ĺ���
		 ex)	class HelloWorld{
		 			main(){
		 				int i;
		 			}
		 		}
		 			
		 * �ĺ��� ��� ��Ģ
		 1. ������(A~Z, a~z)�� ����(0~9)�� '_', '$'�� �������� ���������.
		 2. ù ���ڴ� �ݵ�� �����ڳ� '_'�� �����Ͽ��� �Ѵ�. ���ڷ� �����ؼ��� �ȵȴ�.
		 3. �ĺ��ڴ� ö��(���縵)�� ���ٰ� �ص� ��ҹ��ڸ� �����ϱ� ������ �����ؾ� �Ѵ�.
		 	ex) aaa, AAA ���� �ʴ�.
		 4. �ڹٿ��� ���Ǵ� ������ �ĺ��ڷ� ����� �� ����.
		 	ex) class, int, float
		 5. �ĺ��ڴ� �������̸� �ڱ� ��Ȱ�� �´� �̸��� �ο��Ѵ�.
		 
		 * �ĺ��ڷ� ������� ���ϴ� ��
		 1. �����̽��� \t, \n ���� �� �� ����.
		 	ex) Hello World, Hello\nWorld
		 2. ó�� ���ڴ� ���ڰ� �� �� ����.
		 	ex) 7HelloWorld
		 3. �ڹٿ��� ���Ǵ� Ű����� ���� �� ����.
		 	ex) class, main, int, Double, Scaaner
		 4. Ư�� ���ڴ� '_' Ȥ�� '$'�� ��� �����ϴ�.
		 	ex) #HelloWorld
		 	
		@ �ڹ��� �ڷ� Ÿ��
			�⺻ �ڷ� Ÿ��
				Boolean(����)
				����(Number)
					������(Integer)
						byte	: 1byte(8bit)
						short	: 2byte(16bit)
						char	: 2byte(16bit)
						int		: 4byte(32bit)	<
						long	: 8byte(64bit)
					�Ǽ���(floating, Double)
						float	: 4byte(32bit)
						double	: 8byte(64bit)	<
				����(Character)
						char
						String	<
			���۷��� Ÿ�� : Ŭ����, �������̽�, �迭
			
		@ ����� ����
		���� : �ڷ�Ÿ�� ������;
		
		@ ������ - byte, short, int, long
		
			- ũ������� ����
			 byte	short	int 	long
			 1byte	2byte	4byte	8byte
			 2^0	2^1		2^2		2^3		 
		 */
		
		byte byteVer = 1;
		short shortVar = 128;
		int intVar = 32768;
		long longVar = 2100000000L;	// long Ÿ���� ������ ����� ���̻� L �� ����
		
		System.out.println(byteVer);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		
		/*
		 @ �Ǽ��� - float, double
		   �Ǽ��� ����� ��
		    ����			��		����
		  ======================================
		  	�Ҽ���	1234.5		���� �Ϲ������� ����� �Ǽ��� ������
		  			0.0000987
		  			
		  	������	1.2345E3	������ E�� �������� �տ��� ����� �ڿ��� �����θ� �����
		  			0.987E-5
		 */
		
		double doubleVar = 1.234567890123456789;
		float floatVar = 1.234567890123456789f;  // float�� �Ǽ��� ����� ���̻� f�� ����
		
		System.out.println(doubleVar);
		System.out.println(floatVar);
	}

}
