

public class Ex1301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		1. �߻� Ŭ����
 		- ���� : ���������� Ŭ���� ���� ������������ ������ �����Ͽ� ���� Ŭ������ ��ǥ�ϴ� Ŭ���� �ν��Ͻ��� �����Ҽ� ����
 				�̿ϼ� Ŭ����
 		- �߻� Ŭ���� ����
 			: Ŭ���� ���� �� Ű���� class �տ� abstract Ű���� ����Ͽ� �߻� Ŭ������ �����Ѵ�.
 			
 			: ����
 			=> �Ϲ� Ŭ����
 			
 			class Ŭ�����̸�{
 			
 			}
 			
 			=> �߻� Ŭ����
 			
 			abstract class �߻�Ŭ�����̸�{
 				// �ʵ� ����
 				// �Ϲ� �޼ҵ� ����
 				// ������ ����
 				// �߻� �޼ҵ� ����
 				  
 				 => �޼ҵ�
 				 
 				 ���� ������ ����Ÿ�� �޼ҵ��̸�(�Ű����� ����Ʈ){
 				 		// ��ɹ�
 				 }
 				 
 				 => �߻� �޼ҵ�
 				 
 				 	abstract ���������� ����Ÿ�� �߻�޼ҵ��̸�(�Ű����� ����Ʈ);
 				 						 
 			}
 			
 			: ex)
 			
 			shape - Circle
 				  - Triangle
 				  - Rectangle
 				  
 			[public]  abstract class Shape{	// �߻� Ŭ����
 			
 				// �ʵ� ����
 				  protected double x, y;
 				  
 				// �Ϲ� �޼ҵ� ����
 				  public void draw(){	//�Ϲ� �޼ҵ�
 				  	System.out.println("���� �׸�����!!");
 				  }
 				  
 				// ����Ʈ ������ ����
 				  public Shape(){
 				  
 				  }
 				
 				// ������
 				  public Shape(double x, double y){
 				  	this.x = x;
 				  	this.y = y; 				  
 				  }
 				 
 				// �߻� �޼ҵ�
 				  
 				abstract public void calc();
 				
 			}
 			
 			**�߻� Ŭ������ ��ü�� ���� �� ����. ** <= ���ǻ���
 			Shape s = new Shape(3.14, 5.28); // ��üȭ ����
 											 // cannot instantiate the type Shape
 		
 		- ���� Ŭ�������� ���� Ŭ����(�߻�Ŭ����) ���� �����ϴ� �߻�޼ҵ� ����
 		
 		public class Rectangle extends Shape{
 			double width;
 			double height;
 			
 			.......
 			
 			
 			public void calc(){
 				super.draw();
 				
 				System.out.println("���� : " + width * height);
 			}
 			
 			
 		}
 		
 		public class Triangle extends Shape{
 			double width;
 			double height;
 			
 			.......
 			
 			@Override
 			public void calc(){
 				super.draw();
 				
 				System.out.println("���� : " + (width * height) / 2);
 			}
 			
 		}
 			
 			
 			public class Circle extends Shape{
 			double radius;
 			
 			
 			.......
 			
 			
 			public void calc(){
 				super.draw();
 				
 				System.out.println("���� : " + radius * radius * MATH.PI);
 			}
 			
 		}
 		
 		- �߻� Ŭ������ Ư¡
 			: �߻� Ŭ������ class �տ� abstract Ű���� ����Ͽ� �����Ѵ�.
 			: �߻� Ŭ�������� �޼ҵ嵵 abstract Ű���� ����ϸ� �߻� �޼ҵ尡 �ȴ�.
 			: Ŭ�������� �߻� �޼ҵ尡 �����ϸ� Ŭ������ abstract Ű���带 ����ؼ� �߻� Ŭ������ ����Ǿ�� �Ѵ�.
 			: �߻� Ŭ������ ���� Ȧ�� ��üȭ �� �� ����. �� �����ڸ� ����Ͽ� ��ü�� ������ �� ����.
 			: �߻� Ŭ������ �ٸ� Ŭ������ ���Ͽ� ��ӵǾ�� �Ѵ�. �� ���� Ŭ������ ���� �߻� Ŭ������ �ǹ̰� ����.
 			: �߻� Ŭ������ ���� Ŭ���� �־�� �ϹǷ� �߻� Ŭ������ ������ Ŭ���� 
 */
	}

}
