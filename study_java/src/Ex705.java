
public class Ex705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
    ������ �迭
    
    2.1 �迭 ���� 1 - �迭 ���� �� ����� �迭�� ���� �����ϴ� ���
 		- �迭Ÿ��  �迭������[][];
 		  ex) int day[][]; // 2���� �迭 ����
 		  	  day[0][0] = 1;// ����� �迭�� ���� �Է�
 		  	  	
 		-  �迭Ÿ��[][]  �迭������;  => �迭 ���� ����Ʈ
 		  ex) double[][]  month;  // 2���� �迭 ����
 		  	  month[0][1] = 4;  // ����� �迭�� ���� �Է�
 		  	  
 		-  �迭Ÿ��[] �迭������[];
 		  ex) String[] year[]; // 2���� �迭 ���� 
 		  	  year[1][3] = "2021";
 		  	  
 		- �迭��ü => int[][] day; // 1���� �迭 ����, ����Ʈ �迭���� ���
 					day = new int[2][1];
 					
 					=> int[][] day = new int[2][1];
 					
 					=> double[][] month = new double[3][4];
 					=> String[][] year = new String[2][3]; 
 					
 		
 	2.2 �迭 ���� 2 - �迭�� �����ϴ� ���ÿ� ���� �����ϴ� ���
 	
 	    - �迭Ÿ��  �迭������[];
 		  ex) int day[][] = {{1,2},{3,4},{5,6}};
 		    
 		      ��� : 1  2
 		            3  4
 		            5  6 		      
 		  	
 		-  �迭Ÿ��[]  �迭������;  => �迭 ���� ����Ʈ Ÿ��
 		  ex) double[][]  month = {{1.1, 2,3},{3.4, 7,3}};
 		  
 		      ��� : 1.1  2.3
 		            3.4  7.3
 		  
 		-  �迭Ÿ��[]  �迭������[];
 		  ex) String[] year[] = {{"����", "����", "����"}, {"��ǻ��", "���α׷�", "�ڹ�"}};
 		  	  
 		  	  ��� : ����  ����  ����
 		  	        ��ǻ��  ���α׷�  �ڹ�
 		  	  
 		  	  
 		- �迭��ü => int[][] day;  // �迭 ����
 		 			day = new int[2][2];	// �迭 ��ü ����
 		 			day[0][0] = 1;
 		 			day[0][1] = 2;
 		 			day[1][0] = 3;
 		 			day[1][1] = 4;
 		 			
 		 			��� :  1  2
 		 			       3  4
 		 			
 		 			
 		 			int[][] day;     // �迭 ��ü �ʱ�ȭ
 		 			day = new int[][] {{1, 2}{3, 4}};    
 		 			
 		 			��� :  1  2
 		 			       3  4    
 */
		
		int[][] day;
		day = new int[2][2];
		
		day[0][0] = 1;
		day[0][1] = 2;
		day[1][0] = 3;
		day[1][1] = 4;
		
		for(int i=0; i< day.length; i++) {
			for(int j=0; j<day[i].length; j++ ) {
				System.out.print("\t" + day[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int value1[] : day) {
			for(int value2 : value1) {
				System.out.print("\t" + value2);
			}
			System.out.println();
		}
		
		
	}

}
