// �޼ҵ� �����ε� �� -3

class Calculator{
	//���簢�� ����
	
	double areaRectangle(double width) {
		return width*width;
	}
	
	//���簢�� ����
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
public class Ex905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalcu = new Calculator();
		
		//���簢�� ���� ���ϱ�
		
		double result1 = myCalcu.areaRectangle(10);
		
		System.out.println("���簢�� ���� : " + result1);
		
		//���簢�� ���� ���ϱ�
		
				double result2 = myCalcu.areaRectangle(10,20);
				
				System.out.println("���簢�� ���� : " + result2);
	}

}
