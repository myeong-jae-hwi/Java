class vehicle2{
	// �̸�
	public String name ="����";
	
	// �ִ�ӵ�
	public double maxSpeed;
	
	// ����
	public int seater;

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}
	
	/*public vehicle2() {
		// vehicle2 ����Ʈ ������
	}*/
	
	public vehicle2(double maxSpeed, int seater) {		
		this.maxSpeed = maxSpeed;
		this.seater = seater;
	}
 
}

class Motor2 extends vehicle2{
	//�̸�
	public String name="�ڵ���";
	
	//��ⷮ
	public int displacement;
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	

	public void printInfo() {
		System.out.println("�̸� : " + super.name);
		System.out.println("�ִ�ӵ� : " + maxSpeed);
		System.out.println("���� : " + seater);
		System.out.println("��ⷮ : " + this.displacement);
	}
	
	/*
	public Motor2() {
		// Motor2 ����Ʈ ������
		super();
		/*public vehicle2() {
		// vehicle2 ����Ʈ ������
		}*/
	//}
	
	public Motor2(double maxSpeed, int seater, int displacement) {
		/*
		this.maxSpeed = maxSpeed;
		this.seater = seater;
		*/
		super(maxSpeed, seater);		
		this.displacement = displacement;

	}
	
	
	
	
}


public class Ex1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor2  myCar = new Motor2(160, 5, 2000);
		
		
		/* ���� �ʵ� �� ����
		myCar.maxSpeed = 160;
		
		myCar.seater = 5;
		
		myCar.displacement = 2000;
		*/
		
		/* setter ������� �� ����
		myCar.setMaxSpeed(160);		 
		myCar.setSeater(5);
		myCar.setDisplacement(2000);
		*/
		
		/*
		System.out.println("�̸� : " + myCar.name);
		System.out.println("�ִ�ӵ� : " + myCar.maxSpeed);
		System.out.println("���� : " + myCar.seater);
		System.out.println("��ⷮ : " + myCar.displacement);
		*/
		
		myCar.printInfo();
	}

}
