// �� ���� �߿��� �ִ밪�� �ּҰ��� ���ϴ� ���α׷�

import java.util.Scanner;
public class Ex509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a, b;
		int max, min;
		
		System.out.print("������ ������ 2���� �Է��ϼ���. >> ");
		
		a = input.nextInt();
		b = input.nextInt();
		
		if(a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
			
			System.out.println("�ִ밪 : " + max);
			System.out.println("�ּҰ� : " + min);
		}
	}

}
