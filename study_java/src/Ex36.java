// hasNext(), useDelimiter() �޼ҵ� ��� ��

import java.util.*;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "�����ϴ� �ڹ�, ����ִ� �ڹ�, ��ſ� �ڹ�, �ų��� �ڹ�";
		Scanner input = new Scanner(s);
		// �и��ڸ� ����
		input.useDelimiter("�ڹ�, ");
		
		while(input.hasNext()) {
			System.out.println(input.next());
		}
		
		String s1 = "1    fish    2    fish    red    fish    blue    fish";
		Scanner input2 = new Scanner(s1).useDelimiter("\\s*fish\\s*");
		
		System.out.println(input2.next());
		System.out.println(input2.next());
		System.out.println(input2.next());
		System.out.println(input2.next());
		
		
		String s2 = "1    fish    2    fish    red    fish    blue    fish";
		Scanner input3 = new Scanner(s2).useDelimiter("\\s*fish\\s*");
		
		System.out.println();
		while(input3.hasNext()) {
			System.out.println(input3.next());
		}
	}

}
