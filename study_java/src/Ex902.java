
class Car{
	// �ʵ�
	String company = "�����ڵ���";	// myCar.company
	String model = "G80";	//myCar.model
	String color = "����";	//myCar.color
	int maxSpeed = 350;		//myCar.maxSpeed
	int speed; // 0		// myCar.speed
	
	
	Car(){
		// ����Ʈ ������
	
	}
	
	// �޼ҵ�
	
	int speedUp() {
		return speed += 5;
	}
	
	int speedDown() {
		return speed -= 5;
	}
	
}

public class Ex902 {
	/*
	// �ʵ�
		String company = "�����ڵ���";
		String model = "G80";
		String color = "����";
		int maxSpeed = 350;
		int speed; // 0
		*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. Ŭ���� ���� ���
  - Ŭ���� ����
  	����������(privacy, protected, public, default) class Ŭ����_�̸�{
  		// �ʵ�
  		 * ��ü�� �����Ͱ� ����Ǵ� ��
  		 * ������ : Ÿ�� �ʵ��; �Ǵ� Ÿ�� �ʵ�� = �ʱⰪ;
  		 * ex) int maxSpeed; or int maxSpeed = 350;
  		 
  		// ������
  		 * ��ü ���� �� �ʱ�ȭ ���� ���
  		 * ������ ��� : ��ȯŸ�� X, �Ű����� ����
  		 * ����Ʈ ������, ������
  		 * ����Ʈ ������ : Ŭ����_�̸�(){	}
  		 * ������ : Ŭ����_�̸�(int speed){
  		  			maxSpeed = speed;
  		  }
  		   		 
  		// �޼ҵ�
  		 * ��ü�� ���ۿ� �ش��ϴ� ���� ���  	
  	}
 */
		//��ü ����
		Car myCar = new Car();
		//Ex902 myCar = new Ex902();
		
		// �ʵ尪 �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("����ӵ� : " + myCar.speed);
		
		// �޼ҵ� ���
		System.out.println("����ӵ�(����) : " + myCar.speedDown());
		System.out.println("����ӵ�(����) : " + myCar.speedDown());
		System.out.println("����ӵ�(����) : " + myCar.speedUp());
		System.out.println("����ӵ�(����) : " + myCar.speedUp());
		System.out.println("����ӵ�(����) : " + myCar.speedUp());
		
		
	}

}
