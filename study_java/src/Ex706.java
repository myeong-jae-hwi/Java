
public class Ex706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	����� �迭
 	: �ึ�� ���� ���� �ٸ� �龦������ ����� �迭
 	
 		int ragA[][] = new int [2][];
 		ragA[0] = new int[2];
 		ragA[1] = new int[3];
 		
 		ragA[0][0]	ragA[0][1]
 		ragA[1][0]	ragA[1][1]	ragA[1][2]
 		
 		-����� �迭 �ʱ�ȭ
 		
 		int ary[][] = {{2,3,4}, {2,6,5},{4,2,9}};
 		
 		��� : 2 3 4
 			  2 6 5
 			  4 2 9
 			  
 			  
 		int ary2[][] = {{2,3}, {3,6,9},{4,5,7,8}};
 		
 		��� : 2 3
 		 	  3 6 9
 		 	  4 5 7 8
 		 	  
 		int ary3[][];
 		ary3 = new int[][] {{2,3}, {3,6,9},{4,5,7,8}};
 	
 		��� : 2 3
 		 	  3 6 9
 		 	  4 5 7 8
 */
		
		int ary1[][] = new int[2][];	// ������ �迭 ����
		ary1[0] = new int[2];	//������ �迭 ����
		ary1[1] = new int[3];
		
		ary1[0][0] = 4;
		ary1[0][1] = 2;
		ary1[1][1] = 7;
		ary1[1][2] = 1;
		ary1[1][2] = 5;
		
		System.out.println("ary1�� ���� : " + ary1.length);
		System.out.println("ary1[0]�� ���� : " + ary1[0].length);
		System.out.println("ary1[1]�� ���� : " + ary1[1].length);
		
		// ����� ������ �迭�� �ʱ�ȭ
		
		int ary2[][] = {{2,3}, {3,6,9},{4,5,7,8}};
		
		System.out.println("ary2�� ���� : " + ary2.length);
		System.out.println("ary2[0]�� ���� : " + ary2[0].length);
		System.out.println("ary2[1]�� ���� : " + ary2[1].length);
		System.out.println("ary2[2]�� ���� : " + ary2[2].length);
		
		System.out.println();
		
		for(int i = 0; i<ary2.length; i++) {
			for(int j=0; j<ary2[i].length; j++) {
				System.out.print("\t" + ary2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int ary3[] : ary2) {
			for(int value : ary3) {
				System.out.print("\t" + value);
			}
			System.out.println();
		}
		
	}

}
