import java.util.Scanner;

public class Ex507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if~else���� �̿��� ���� �Ǻ� ���α׷�
		Scanner input = new Scanner(System.in);
		
		int score;
		
		System.out.print("������ �Է��ϼ���. >> ");
		
		score = input.nextInt();
		
		// int score = 93;
		
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
	}

}
