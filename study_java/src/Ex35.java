// 1�ܰ� : java.util.Scanner Ŭ������ import �Ѵ�.
import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�ܰ� : ScannerŬ���� ��ü�� �����Ѵ�.
		Scanner input = new Scanner(System.in);
				
		// 3�ܰ� : ���� ����
		String greeting, name;
		
		// 4-1�ܰ� : �Է¹��� ���뿡 ���� ������ �ۼ��Ѵ�.
		System.out.print("�λ� ���� �Է��ϼ���. >> ");
				
		// 4-2�ܰ� : nextLine() �޼ҵ带 �̿��ؼ� ���ڿ��� �Է��Ѵ�.
		greeting = input.nextLine();
				
		// 4-3�ܰ� : �Է¹��� ���뿡 ���� ������ �ۼ��Ѵ�.
		System.out.print("�̸��� �Է��ϼ���. >> ");
						
		// 4-4�ܰ� : nextLine() �޼ҵ带 �̿��ؼ� ���ڿ��� �Է��Ѵ�.
		name = input.nextLine();
						
		
		// 7�ܰ� : ��� c�� �ֿܼ� ����Ѵ�.
		System.out.println();
		System.out.println("�λ縻 : " + greeting);
		System.out.println("�̸� :  " + name);
	}

}
