// 1�ܰ� : java.util.Scanner Ŭ������ import �Ѵ�.
import java.util.*;
import java.util.Scanner;
public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�ܰ� : ScannerŬ���� ��ü�� �����Ѵ�.
		Scanner input = new Scanner(System.in);
		
		// 3�ܰ� : ���� ����
		double a,b,c;
		
		// 4�ܰ� : �Է¹��� ���뿡 ���� ������ �ۼ��Ѵ�.
		System.out.print("�Ǽ��� ������ 2���� �Է��ϼ���. >> ");
		
		// 5�ܰ� : nextInt() �޼ҵ带 �̿��ؼ� �������� �Է��Ѵ�.
		
		a = input.nextDouble();
		b = input.nextDouble();
		
		// 6�ܰ� : a�� b�� ó���Ѵ�.
		c = a*b;
		
		// 7�ܰ� : ��� c�� �ֿܼ� ����Ѵ�.
		System.out.println(a + " * " + b + " = " + c);
	}

}
