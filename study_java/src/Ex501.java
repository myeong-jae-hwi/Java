import java.util.Scanner;


public class Ex501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. ���ǹ�
  - �ܼ� if : ���ǿ� ���� � ����� ���������� ó���ϱ� ���� ����ϴ� ���� ��ǥ���� ���ǹ� ����
  - ���� : 
  		 if(���ǹ�){
  		 	 ���ǿ� ������ ��� ����Ǵ� ����1;
  		 	 ���ǿ� ������ ��� ����Ǵ� ����2;
  		 }
  		 
  		 : ���ǹ� or ���ǽ� => true �Ǵ� false ���� ������ �� �ִ� �����, boolean ����
 */
		
		// ���밪 ���ϱ� ���α׷�
		
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.print("������ ������ �� ���� �Է��ϼ���. >> ");
		
		a = input.nextInt();
		
		if(a <0) {
			a=-a;
		}
		
		System.out.println("���밪�� " + a + "�Դϴ�.");
		
	}

}
