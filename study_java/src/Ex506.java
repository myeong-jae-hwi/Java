import java.util.Scanner;

public class Ex506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  if~else�� : ���ǽ��� ����� ���� ���๮�� ����
  
  	���� : 
  		if(����){
  			���ǿ� ������ ��� ����Ǵ� ����;
  		}
  		else{
  			���ǿ� �������� ���� ��� ����Ǵ� ����;
  		}
 */
		// ¦������ Ȧ������ �Ǻ��ϴ� ���α׷�
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.print("0 �̻��� ������ ������ �� ���� �Է��ϼ���. >> ");
		
		a = input.nextInt();
		
		if(a % 2 == 1) {
			System.out.println("Ȧ���̴�.");
		}
		else {
			System.out.println("¦���̴�.");
		}
		
	}

}
