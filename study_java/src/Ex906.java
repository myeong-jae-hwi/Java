/*
 	1. this ���۷���
 	- Ư¡ : 1. �ν��Ͻ� �޼ҵ� ���ο� �������� �ʰ� ��������ó�� ���
 			2. �ڱ� �ڽŸ��� ����Ű�� ���۷���
 			  ex) this.width = width; <= ����� ���
 			3. �޼ҵ� ������ ��� �ν��� �ʵ�� �޼ҵ� �տ� �Ͻ������� ���
 			  ex) width = wid; <= �Ͻ��� ���
 			4. �ʿ信 ���� ��������� ����� �� �ִ�.
 	-�� 1 : �Ű������� ���� ���
 	===========================================================
 	this�� �Ͻ������� ���� ��
 	===========================================================
	int getSpeed(){
	  return speed;
	  }

	===========================================================
 	this�� ��������� ���� ��
 	===========================================================
 	   int setSpeed(){
 	   return this.speed;
 	 }
 	 
 	 
 	-�� 2 : �Ű������� �ִ� ���
 	 	this�� �Ͻ������� ���� ��
 	===========================================================
	int getSpeed(int sp){
	  return speed = sp;
	}

	===========================================================
 	this�� ��������� ���� ��
 	===========================================================
 	   int setSpeed(int speed){
 	   return this.speed = speed;
 	 }
 */

class Car3{
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class Ex906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car3 car03 = new Car3();
		
		System.out.println("���� �ӵ� : " + car03.getSpeed());
		
		car03.setSpeed(10);
		
		System.out.println("���� �ӵ� : " + car03.getSpeed());
	}

}
