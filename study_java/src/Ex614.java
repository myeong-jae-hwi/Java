
public class Ex614 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 5. continue ��
		  		  
		  for(�ʱ⹮; ���ǽ�; ������, �ݺ� �� �۾�){
		  	......
		  	......
		  	continue;
		  	......
		  }
		  
		  �ʱ⹮
		  while(���ǽ�){
		  	......
		  	......
		  	������;
		  	continue;
		  	......
		  }
		  
		  �ʱ⹮;
		  do {
		  	......
		  	......
		  	������;
		  	continue;
		  	......
		  }while(���ǽ�)
		 
		 */
		
		// 1���� 100������ ¦���� ��
		
		int sum = 0;
		
		for(int i = 1; i <=100; i++) {
			if(i%2 == 1) {
				continue;
			}
			else {
				sum += i;
			}
		}
		
		System.out.println("1���� 100���� ¦���� �� = " + sum);
		
		// 1���� 100���� Ȧ���� ��
		
		int sum1 = 0;
		
		for(int i = 1; i <=100; i++) {
			if(i%2 == 0) {
				continue;
			}
			else {
				sum1 += i;
			}
		}
		
		System.out.println("1���� 100���� Ȧ���� �� = " + sum1);
	}

}
