class vehicle{
	// �̸�
	public String name = "����";
	
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
	
	
	
	
}

class Motor extends vehicle{
	// �̸�
	public String name = "�ڵ���";
	// �ִ�ӵ�
	public double maxSpeed = 200;
	// ��ⷮ
	public int displacement;
	
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	/*
	 this : ��ü �ڽ��� �ǹ��ϴ� Ű����
	 		=> �θ� Ŭ������ �ڽ� Ŭ���� �� ������ �ʵ��(�Ǵ� �޼ҵ��)�� ����� ���,
	 			�ڽ� Ŭ������ �ʵ�(�Ǵ� �޼ҵ�)�� �����ϰ��� �� �� ��� 
	 super : ���� ��ü�� �ǹ��ϴ� Ű����
	 		=> �θ� Ŭ������ �ڽ� Ŭ���� �� ������ �ʵ��(�Ǵ� �޼ҵ��)�� ����� ���,
	 			�θ� Ŭ������ �ʵ�(�Ǵ� �޼ҵ�)�� �����ϰ��� �� �� ���
	 */
	public void printInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("�ִ�ӵ� : " + super.maxSpeed);
		System.out.println("���� : " + seater);
		System.out.println("��ⷮ : " + displacement);
	}
}

public class Ex1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*
 	1. ��� 
 	- �ڽ��� �θ� ������ �ִ� ����̳� �Ƿ��� �����޴´�.
 	- Ŭ���� ���� ���� : Ư��(�ڽ�) Ŭ������ �ٸ�(�θ�) Ŭ������ ������ �ִ� ��� �ʵ峪 �޼ҵ带 ����� �� �ִ�.
 	- �������� : �θ�(����)-�ڽ�(����) Ŭ����, extends, is to ����
 	- ������� : ���� Ŭ����, implements, has to ����
 	
 	- ���� ���� ��� ����
 	
 	��� ���� => ����(super) Ŭ����, �θ� Ŭ����
 	- �ڵ��� => �ڽ� Ŭ����
 		- �ڰ��� => ���� Ŭ����, �ڽ� Ŭ����
 			: ����
 			: SUV
 		- �ý�
 		- Ʈ��
 		
 	ex) class �ڰ��� extends �ڵ���{
 	}
 	
 		class �ý� extends �ڵ���{
 	}
 	
 		class ���� extends ��ۼ���{
 	}
 	
 	- �����
 	ex) class ����� implements ��ۼ���{
 	}
 	- ������
 	
 	- ��ӿ� ���� ���� ����
 	1. �ڵ���(�ڽ�) Ŭ������ ��� ����(�θ�) Ŭ�����κ��� �Ļ��� ��ü�μ� ��� ����(�θ�) Ŭ������ ������ �ִ�
 		��� �Ӽ�(�ʵ�, �޼ҵ�)���� �ۻ�ӹ޾� ����� �� �ִ�.
 	2. �ý�(�ڽ�) Ŭ������ �ڵ���(�θ�) Ŭ�����κ��� �Ļ��� ��ü�μ� �ڵ���(�θ�) Ŭ������ ������ �ִ� ��� �Ӽ�����
 		��ӹ޾� ����� �� �ִ�.
 		
 	- ����
 	
 		class ����Ŭ������ extends ���� Ŭ������{
 		}
 		
 		class �ڽ� Ŭ������ extends �θ� Ŭ������{
 		}
 	
 */
	
		Motor myCar = new Motor();
				
		/*
		myCar.maxSpeed = 160;
		
		myCar.seater = 5;
		
		myCar.displacement = 2000;
		*/
		
		myCar.setMaxSpeed(160);
		myCar.setSeater(5);
		myCar.setDisplacement(2000);
		
		/*
		System.out.println("�̸� : " + myCar.name);
		System.out.println("�ִ�ӵ� : " + myCar.maxSpeed);
		System.out.println("���� : " + myCar.seater);
		System.out.println("��ⷮ : " + myCar.displacement);
		*/
		
		myCar.printInfo();
	}
}
	
	
