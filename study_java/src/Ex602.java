
public class Ex602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 2. for ��
		 - ���� 
		 	
		 	��ɹ�;
		 	for(�ʱ⹮; ���ǽ�; �ݺ� �� �۾�){
		 	//	�ʱ��; ���ǽ�; ������
		 	 	��ɹ�;
		 	}
		 	��ɹ�;
		 	
		 - �ʱ⹮
		 	: �밳 for ���� ���ǽĿ��� ����ϴ� ������ �ʱ�ȭ
		 	ex) int i = 1;
		 	
		 	: Ư¡
		 	1. �ʱ⹮�� ������ �� �� ���� ����ȴ�.
		 	2. �޸�(,)�� �и��Ͽ� ���� ������ ������ �� �ִ�.
		 	 ex) for(int i, int j, ...; i < 10; i++, j++)
		 	3. �ʱ⹮�� �� ���·� �ξ �ȴ�.
		 	 ex) int i=1; 
		 	 	 for(;i<10;i++)
		 	 	 �Ǵ�
		 	 	 int i;
		 	 	 for(i=1;i<10;i++)
		 	 	 �Ǵ�
		 	 	 for(int i=1; i<10; i++)
		 	 	 
		 	 - ���ǹ�
		 	 : ���� ������ �� �����ڸ� ����� �� �ִ�.
		 	 : ���ǽ��� ����� true�� ��� �ݺ��� ��ӵǷ� false�� ��� �ݺ� ����
		 	  ex) for(int i=1; true; i++) // ���ѷ���
		 	  	  for(int i=1; ; i++) // ���ѷ���
		 	  	  for(int i=1; i<10; i++)
		 	  	  
		 	  - �ݺ� �� �۾�
		 	  : for(int i=1; i<10; i++){ // ������
		 	  		System.out.println(i);
		 	  }
		 	  
		 	  => for(int i=1; i<10; i++, System.out.println(i)){
		 	  
		 	   }
		 	   
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.print("\t"+i);
		}
	}

}
