// if~else if���� �̿��� ��ҹ��� �����ϴ� ���α׷�

import java.util.Scanner;

public class Ex511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String str; //asdfasdfasdf
		char ch;  //a
		
		System.out.print("���ڸ� �Է��ϼ���. >> ");
		
		str = input.nextLine();
		
		ch = str.trim().charAt(1);
		// s;dalkfj;asdkl
		
		
		if(ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch+32);
			System.out.println("�빮�� => �ҹ���: " + ch);
		}
		else if(ch >= 'a' && ch <='z') {
			ch = (char)(ch-32);
			System.out.println("�ҹ��� => �빮��: " + ch);
		}
		else {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
		
		System.out.println("���� �� ���ڴ�" + ch + "�Դϴ�.");
	}

}
