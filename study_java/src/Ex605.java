
import java.util.Random;

public class Ex605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  for(�ʱ⹮; ���ǽ�; �ݺ� �� �۾�){	// ��, ��
		 	 	��ɹ�;
		 	 	for(�ʱ⹮; ���ǽ�; �ݺ� �� �۾�){	//��, ĭ
		 	 	 	��ɹ�;
		 	 	 }
		 	 	 
		 	 	 System.out.println();
		 	 	 
		 	 	 ��ɹ�;
		 	 	 }
		 */
		/*
		int x = 1;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("\t" + x);
				x++;
			}
			System.out.println();
		}
		*/
		
		// Random Ŭ������ �̿��� �࿭ ���� ��Ÿ����
		
		Random rnd = new Random();
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("\t" + rnd.nextInt(100)+1);
				}
			System.out.println();
		}
	}

}
