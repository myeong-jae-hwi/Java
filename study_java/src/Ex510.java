import java.util.Scanner;

public class Ex510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  if~else if ��
  if~else if~else ��
  
  ���� :
  
  		if(����1){
  			���� 1�� ������ �� ������ ����;
  			}
  		else if(����2){
  			���� 2�� ������ �� ó���� ����;
  			}
  			
  		..........
  		
  		else if(���� n){
  			���� n�� ������ �� ó���� ����;
  			}
  		else {
  			������ ����� ��� ���ǿ� ���ؼ� �������� ���� �� ó���� ����;
  			}
 */
		// ���, ����, 0 �����ϴ� ���α׷�
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.print("������ ������ �� ���� �Է��ϼ���. >>");
		
		a = input.nextInt();
		
		if(a > 0) {
			System.out.println("����̴�.");
		}
		else if(a < 0) {
			System.out.println("�����̴�.");
		}
		else {
			System.out.println("0�̴�.");
		}
		
	}

}
