import java.util.Scanner;

public class Ex616 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while���� break���� ����Ͽ� -1�� �Էµɱ��� �Էµ� ������ ������ ���� ����ϴ� ���α׷�
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int hap = 0;
		int a;
		
		while(true) {
			System.out.print("������ �������� �־��ּ���. �� -1�̸� ����˴ϴ�. >> ");
			if((a =input.nextInt()) == -1) {
				break;
			}
			
			num++;
			hap += a;
		}
		
		System.out.println("�Էµ� ������ ���� : " + num);
		System.out.println("�Էµ� ������ �� : " + hap);		
		
	}

}
