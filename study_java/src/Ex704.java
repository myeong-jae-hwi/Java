
public class Ex704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  �迭 ����
  => �ڹ��� System Ŭ������ �迭�� ���� ������ �� �ִ� �޼ҵ� arraycopy() �޼ҵ带 ����
  
  public static void arraycopy(Object src,		// ������ ���� �迭
  								int srcPos, 	// ������ src�� ���� ÷�� ��ġ
  								Object dest,	// ����� ��� �迭
  								int dest, 		// ����� dest�� ���� ÷�� ��ġ
  								int leng		// ������ ������ ��
  								
  	
  		src		1, 2, 3, 4, 5, 6 ....
  		
  		dest	11, 12, 13, 14, 15, 16 ....
  		
  		System.arraycopy(src, 2, dest, 3, 3);
  		
  		��� : dest	11, 12, 13, 3, 4, 5, 17, 18, 19
  		
  	2. �迭 ���Ҹ� ����ϱ� ���� ���� for
  	
  	  int[] copyForm = {1,2,3,4,5,6,7};
  	  
  	  for(int i = 0; i < copyForm.length; i++){
  	  		System.out.print(copyForm[i]);
  	  }
  	  
  	  => ��� : 1 2 3 4 5 6 7
  	  
  3. �迭 ���� ����� ���� for each 
  
  	int[] coyTo = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
  	
  	for(int value : copyTo ){
  		System.out.print(value + "\t");
  	}
 */
		
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		System.out.println("copyFrom �迭 : ");
		for(int i = 0; i < copyFrom.length; i++) {
			System.out.print("\t" + copyFrom[i]);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("copyTo �迭 : ");
		for(int value : copyTo) {
			System.out.print("\t" + value);
		}
	}

}
