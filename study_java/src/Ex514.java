
public class Ex514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  switch ��
  
  ���� : 
  
 	���� 1
 	
 	switch(������){
 			case ������1 : 
 				����;
 				break;
 			case ������2 :
 				����;
 				break;
 			case ������3 :
 				����;
 				break;
 				....
 				
 			default:
 				���� m;
 	}
 	
 	���� ����;
 	
 	* switch~case �� ���� ���ǻ���
 	1. switch ���� ���۰� �P�� �˸��� {, } ��ȣ�� ���� ������ �� ����.
 	2. case �� ������ ���� ���� ���� �޶�� �Ѵ�.
 	3. switch ���� �����Ŀ��� ������ ������ �� �� ������, ���� ������ ������ ������ �� �� ����.
 	   �ݵ�� ���� ����ؾ� �Ѵ�.
 */
		
		int time = (int)(Math.random()*4) + 8;
		
		System.out.println("���� �ð� : " + time + "��");
		
		switch(time) {
			case 8:
				System.out.println("����մϴ�.");
				break;
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�.");
				break;
			case 10:
				System.out.println("������ ���ϴ�.");
				break;
			default:
				System.out.println("�ܱ��� �����ϴ�.");
		}
	}

}
