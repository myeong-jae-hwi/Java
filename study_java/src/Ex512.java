
public class Ex512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		// �ֻ����� ������ ���� �� �ִ� 1,2,3,4,5,6 �� �ϳ��� ���� �̾Ƽ� ����ϴ� ���α׷�
 		 
 		 0.0 <= Math.random()  < 1.0
 		 
 		 1~10���� ���� �� �ϳ��� ������ ���� ��
 		 
 		 0.0 *10 <= Math.random() < 1.0 *10
 		  (0.0)						 (10.0)
 		  
 		 (int) 0.0 <= Math.random() < 	(int) 10.0
 		 	 (0)						  (10)
 		 	 
 		 �� ���¿��� �� ���� 1�� ���ϸ�
 		 
 		  0+1 <= Math.random() < 10+1
 		  (1)						(11)
 		  
 		  start ���� �����ϴ� n���� ���� �߿��� ���� ���� �ϳ��� ��� ���� �����
 		  
 		   int num = (int) (Math.random()*n) + start; 
 		   
 		   ���� ��� �ֻ��� ��ȣ�� �ϳ��� �̱� ���� ����ϴ� �����
 		   
 		   int num = (int)(Math.random() *6) + 1;
 		   
 		   �� �ٸ� ���� �ζ� ��ȣ �ϳ��� �̱� ���� ���Ǵ� �����
 		   
 		   int num = (int) (Math.random() * 45) + 1;
 */
		
		int num = (int)(Math.random()*6) + 1;
		
		if(num == 1) {
			System.out.println("1�� ���Խ��ϴ�.");
		}
		else if(num == 2) {
			System.out.println("2�� ���Խ��ϴ�.");
		}
		else if(num == 3) {
			System.out.println("3�� ���Խ��ϴ�.");
		}
		else if(num == 4) {
			System.out.println("4�� ���Խ��ϴ�.");
		}
		else if(num == 5) {
			System.out.println("5�� ���Խ��ϴ�.");
		}
		else {
			System.out.println("6�� ���Խ��ϴ�.");
		}
	}

}
