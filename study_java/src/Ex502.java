
public class Ex502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Ȯ�� ���α׷�
		int score = 53;
		
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		if(score >= 80 && score < 90) {
			System.out.println("������ 80���� Ů�ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
		
		if(score >= 70 && score < 80) {
			System.out.println("������ 70���� Ů�ϴ�.");
			System.out.println("����� C �Դϴ�.");
		}
		
		if(score >= 60 && score < 70) {
			System.out.println("������ 60���� Ů�ϴ�.");
			System.out.println("����� D �Դϴ�.");
		}
		
		if(score < 60) {
			System.out.println("������ 60���� �۽��ϴ�.");
			System.out.println("����� F �Դϴ�.");
		}
		
	}

}
