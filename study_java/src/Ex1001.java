// 1�ܰ� class ����
class Car2{
	private int speed;
/*	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
*/
	// �޴�(source) Ŭ�� - getter/setter �޴� Ŭ��
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public void speedUp(int speed) {
		this.speed = this.speed + speed;
	}
	
	public void speedDown(int speed) {
		this.speed = this.speed - speed;
	}
	
	// speedUp() �����ε�
	
	public void speedUp() {
		speedUp(5);
	}
	
	
	// speedDown() �����ε�
	
	public void speedDown() {
		speedDown(5);		
	}
	
}


public class Ex1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1. Setter, getter
  	* ���� ����
  	1. ������ �����ϰ�, ����� ������ ���� �Է��ϴ� ��� => setter/getter 
  		ex) int i;
  			i=1;
  	2. ������ �����ϴ� ���ÿ� ���� �Է��ϴ� ��� => ������
  		ex) int i=1; <= ���� �ʱ�ȭ
  		
  	* setter Ư¡
  	  - ��ȯŸ���� �������� �ʴ´�. => void ���
  	  - �Ű����� �����Ѵ�.
  	  - ex) 
  	  ============================
  	  �Ű������� �̸��� �ʵ�� ���� ���         
  	  ============================
  	  	void setSpeed(int speed){
  	  		this.speed = speed;
  	  	 }
  	  
  	  ============================
  	  �Ű������� �̸��� �ʵ�� �ٸ� ���         
  	  ============================
  	    void setSpeed(int sp){
  	    	this.speed = sp;
  	    }	
  	    	
  	* getter Ư¡
  	  - ��ȯŸ���� �ʿ��ϴ�.
  	  - �Ű������� �������� �ʴ´�.
  	  - return ���
  	  - ex)
  	 
  	  ============================
  	  this�� �Ͻ������� ���� ��         
  	  ============================
  	  int getSpeed(){
  	  	return speed;
  	  }
  	  
  	  
  	  ============================
  	  this�� ��������� ���� ��         
  	  ============================
  	  int getSpeed(){
  	  	return this.speed;
  	  }	 	 	
 */
		
		// 2 �ܰ� : ��ü ����
		
		Car2 car3 = new Car2();
		
		// 3 �ܰ� : ��ü ���
		
		car3.setSpeed(10);
		
		System.out.println("Speed �ʵ� �� : " + car3.getSpeed());
		
		
		car3.speedDown();
		System.out.println("Speed �ʵ� �� : " + car3.getSpeed());
		
		//car3.setSpeed(5);
		car3.speedUp();
		System.out.println("Speed �ʵ� �� : " + car3.getSpeed());
		
	}

}
