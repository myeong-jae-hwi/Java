import java.io.IOException;

public class Ex31 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*
 	- ���� : System.in ��ü�� read() �޼ҵ带 ȣ���Ͽ� Ű���忡�� �����͸� �Է��� ���� �� �ִ�.
 	* read() �޼ҵ� 	 
 	- ���� : public abstract int read() throws IOException
 	- Ư¡ : 1.Ű���忡�� �� byte�� ���ۿ� ����Ǿ� �ִ� ������ �д´�.
 			2. �� �̻� ���� ���� ���� ��� -1�� �����Ѵ�.
 			3. ����(Exception) ó���ؾ� �Ѵ�.
 				* ����ó���� ���õ� Ŭ������ import �ؾ� �Ѵ�.
 				* java.io.IOException
 				 
 	- ���� : 1�ܰ� : �� ���ٿ� import java.io.IOException; �Է�
 			2�ܰ� : main() �Լ� ������ throws IOException �߰�
 			3�ܰ� : �Է��ϱ� ���� ����(data)�� ����.
 				   �� ��, ������ �ڷ�Ÿ���� �ݵ�� int ���� ����Ѵ�.
 				   int data=0;
 			4�ܰ� : read() �޼ҵ带 �̿��ؼ� �� ����Ʈ �� �Է¹޴´�.
 					data = System.in.read();
 			5�ܰ� : ����� data�� ����Ѵ�.
 			6�ܰ� : ��� �޼ҵ� System.out.println()�� ����ؼ� (char)data�� ����Ѵ�.
 */
		
			System.out.println("read() �޼ҵ忡 ���� �����Դϴ�.");
			System.out.println();
			int data=0;
			System.out.print("�� ����Ʈ�� ���ڸ� �Է����ּ���. >> ");
			data = System.in.read();
			
			System.out.println(data);
			System.out.println((char)data);
	}

}
