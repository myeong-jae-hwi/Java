import java.io.IOException;

public class Ex505 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �빮�ڸ� �ҹ��ڷ� �����ϴ� ���α׷�
		
		int ch=0;
		
		System.out.println("�ҹ��ڸ� �빮�ڷ� �����ϴ� ���α׷�");
		System.out.print("���� �� ���� �Է��ϼ���. >> ");
		
		ch = System.in.read();
		
		if(ch >= 'a' && ch <= 'z') {
			ch = ch - 32;
		//65(A) = 97 - 32
		}
		
		System.out.println((char)ch);	
		
	}

}
