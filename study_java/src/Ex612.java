import java.util.Scanner;

public class Ex612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0�� �ԷµǱ� ������ �Է¹��� ������ �� ���ϱ�
		
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int total = 0;
		
		System.out.println("0�� �ԷµǱ� ������ �Է¹��� ������ �� ���ϱ�");
		
		do {
			total += a;
			System.out.print("������ ���� �����͸� �Է��ϼ���. >> ");
		}while((a = input.nextInt()) != 0);
		
		System.out.println("Total = " + total);
	}

}
