import java.util.*;
public class Ex610 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Ű����� while �� ���� ���α׷�
		
		boolean run = true;
		
		int speed = 0;
		int keyCode = 0;
		
		// for(;;){ // ���ѷ���
		//}
		
		while(run) { // ���ѷ���, while(1), while(true)
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("================================");
				System.out.println("	1. ���� | 2. ���� | 3. ����		");
				System.out.println("================================");
				
				System.out.print("���� : ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) { // 1�� �о��� ���
				speed ++;
				System.out.println("���� �ӵ� : " + speed);
				System.out.println();
			} 
			else if(keyCode == 50) { // 2�� �о��� ���
				speed --;
				System.out.println("���� �ӵ� : " + speed);
				System.out.println();
			}
			else if(keyCode == 51) { // 3�� �о��� ���
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
		System.out.println("Bye-- Bye--");
	}

}
