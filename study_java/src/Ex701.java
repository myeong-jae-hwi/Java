
public class Ex701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. �迭
   ������ �ڷ����� ������ ����ŭ ���� ó���� �� ó���ϴ� ��ü
   �迭 �׸� : ����
     - ���Ҵ� 0���� �����ϴ� ���� ÷�ڿ� ���� ����
     ex) x[0], x[1]
     - �迭 ũ�Ⱑ n�̸� ÷�ڴ� 0���� n-1���� ��ȿ
     - �迭 ũ�⸦ �˾ƺ��� ���� ��� : �迭��.length
       ex) array.length, x.length
       
  2. �迭 ��ü�� �����ϴ� �迭 ���� ����
  	 * ���� ����
  	   - ������ �����ϰ� ����� ������ ���� �Է�
  	     ex) int i;
  	     	 i = 0;
  	   - ������ �����ϴ� ���ÿ� ���� �Է� => ���� �ʱ�ȭ
  	     ex) int i = 0;
  	     
	2.1 �迭 ���� 1 - �迭 ���� �� ����� �迭�� ���� �����ϴ� ���
		- �迭Ÿ�� �迭������[];
		  ex) int day[]; //  1���� �迭 ����
		      day[0] = 1; // ����� �迭�� ���� �Է�
		- �迭 Ÿ��[]	�迭 ������;  => �迭 ���� ����Ʈ
		  ex) double[]	month; // 1���� �迭 ����
		  	  month[0] = 4; // ����� �迭�� ���� �Է�
		- �迭 Ÿ��	[]�迭������;
		  ex) String [] year; // 1���� �迭 ����
		  	  year[0] = "2021";
		- �迭 ��ü => int[] day;  // 1���� �迭 ����, ����Ʈ �迭���� ���
			  		 day[0] = new int[4];
			  		 
			  		 => int [] day = new int[4];
			  		 
			  		 => double[] month = new double[12];
			  		 => String[] year = new String[3];
			  		 
			�񱳹��� => Scanner input = new Scanner(System.in);
	
	
	
	2.2 �迭 ���� 2 - �迭�� �����ϴ� ���ÿ� ���� �����ϴ� ���
	
		- �迭Ÿ�� �迭������[];
		  ex) int day[] = {1,2,3,4,5,6,7,8};
		  
		  	  * int day[8] ó�� ����ϸ� ������ �߻��մϴ�.
		  	  
		  	  System.out.println(day.length);
		  	  
		- �迭 Ÿ��[]	�迭 ������;  => �迭 ���� ����Ʈ
		  ex) double[]	month = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0}; 
		  	  
			  System.out.println(month.length);
			  System.out.println(month[2]);
			  
		- �迭 Ÿ��	[]�迭������;
		  ex) String [] year = {"����", "����", "����"};
		  	  
		- �迭 ��ü => int[] day;  // 1���� �迭 ����, ����Ʈ �迭���� ���
			  		day = new int[3];	// �迭 ��ü ����
			  		day[0] = 1;
			  		day[1] = 2;
			  		day[2] = 3;
			  		
			  		int[] day;		//�迭 ��ü �ʱ�ȭ
			  		day = new int[] {1,2,3};
 */
		// * �迭�� �����ϰ� ����� �迭�� ���� ���� ����
		// �迭 ����
		
		int[] x; // int x[]; or	int []x;
		double[] y; //double y[]; or double []y;
		
		// �迭 ����
		
		x = new int[4];
		y = new double[3];
		
		// �迭 ũ�� Ȯ��
		
		System.out.println("x �迭�� ũ�� : " + x.length);
		System.out.println("y �迭�� ũ�� : " + y.length);
		
		System.out.println();
		
		// * �迭�� �����ϴ� ���ÿ� ���� ���� ����
		char[] ch = new char[6];
		String[] str = new String[4];
		
		//�迭 ũ�� Ȯ��
		System.out.println("ch �迭�� ũ�� : " + ch.length);
		System.out.println("str �迭�� ũ�� : " + str.length);
		
	}

}
