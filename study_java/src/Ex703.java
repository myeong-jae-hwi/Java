
public class Ex703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	�迭 ���� ������ �ʱ�ȭ�� �ٸ� �迭�� ����
 	
 	* �迭 ���� ���� �迭 �̸����� �ʱ� ���� �����ϸ� ������ �߻�
 	 
 	ex) int score[];
 		score = {2, 4, 7}; // �����߻�
 		
 		=> int score[]; 	//���������� ����
 		   score = new int[] {2, 4, 7};
 		   
 		   System.out.println(score[0] + " " + score[1] + " " + score[2]);
 		   
 		   score = new int[] { 23, 46, 78};
 		   
 		   System.out.println(score[0] + " " + score[1] + " " + score[2]);
 */
		
		int score[];
		score = new int[] {2, 4, 7};
		// score = {2, 4, 7}; => �����߻�
		
		System.out.println(score[0] + " " + score[1] + " " + score[2]);
		
		score = new int[] {23, 46, 78};
		
		System.out.println(score[0] + " " + score[1] + " " + score[2]);
	}

}
