
public class Ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1���� 100������ ���� ���
		
		int sum = 0;
		/*
		for(int i=1; i<=100; i++) {
			//sum = sum + i;
			sum += i;			
		}
		*/
		/*
		int i=1;
		for(;i<=100; i++) {
			sum += i;
		}
		*/
		
		/*
		int i;
		for(i=1; i<=100; i++) {
			sum+= i;
		}
		*/
		
		for(int i=1; i<=100; sum += i, i++) {
			
		}
		System.out.println("1���� 100������ �� : "+ sum);
	}

}
