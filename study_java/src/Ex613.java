
public class Ex613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// do ~ while�� �̿��� ���
		char a = 'a';
		
		do {
			System.out.print("\t" + a);
			a = (char) (a+1);
		}while(a <= 'z');
		
		System.out.println();
		
		// for�� �̿��� ���
		
		for(char b = 'a'; b<='z'; b++) {
			System.out.print("\t" + (char) b);
			a = (char) (b+1);
		}
		
		System.out.println();
		
		// while�� �̿��� ���
		
		char c = 'a';
		
		while(c <= 'z') {
			System.out.print("\t" + c);
			c = (char) (c+1);
		}
	}

}
