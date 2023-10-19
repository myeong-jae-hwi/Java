// ���� : �ڵ����� ǥ�� Ŭ���� Car5 �� �ְ� �ӵ�, �귣�� �̸�, ���� �ӵ��� �ʵ�� ������ �� �޼ҵ带 ����
//		 Ŭ������ ���� Ŭ���� �������� ����ϴ� ������ ���� �ۼ��Ͻÿ�.

class Car5{
	private int maxSpeed; // �ְ� �ӵ�
	public String brandName; // �귣�� �̸�
	public int speed; // ����ӵ�
	
	public Car5(){		
	}
	
	public Car5(String brandName){
		this.brandName = brandName;
	}
	
	public Car5(int speed){
		this.maxSpeed = speed;
	}
	
	public Car5(String brandName, int speed){
		this.brandName = brandName;
		this.maxSpeed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// �ӵ� ���� �޼ҵ�
	public int speedUp() {
		return this.speed += 30;
	}
	
	public int speedDown() {
		return this.speed -= 30;
	}
	
}

public class Ex1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car5 mycar = new Car5("�ΰ�Ƽ", 300);
		mycar.speedUp();
		mycar.speedUp();
		System.out.println("���� : " + mycar.brandName);
		System.out.println("�ְ� �ӵ� : " + mycar.getMaxSpeed());
		System.out.println("���� �ӵ� : " + mycar.getSpeed());
		System.out.println("���� �ӵ� : " + mycar.speedDown());
		System.out.println("���� �ӵ� : " + mycar.getSpeed());
		
		
	}

}
