/*
  Shape(�߻�Ŭ����) - Circle
  					protected int radius; // ������ �ʵ�
  					Circle(int radius){
  						this.radius = radius
  					}
  					public void calcArea(){
  						System.out.println("���� : " + radius * radius*MATH.PI);
  					}
  				 - Rectangel
  				 - Triangle
 */

abstract class Shape{
	// ������ ������ ������ ���뵵�� �ʵ�
	
	protected double area;

	// ���� ���� �˷��ִ� �޼ҵ�
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	// ������ ������ ���ϱ� ���� �߻� �޼ҵ�
	
	abstract public void calcArea();
	
}


class Circle extends Shape{
	protected int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void calcArea() {
		area = radius * radius * Math.PI;
	}
}

class Rectangle extends Shape{
	protected int width;
	protected int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calcArea() {	// �������̵�
		area = width * height;
	}
}

class Triangle extends Shape{
	protected int width;
	protected int height;
	
	public Triangle() {
		
	}
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calcArea() {	// �������̵�
		area = width * height / 2;
	}
}

public class Ex1302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �߻� Ŭ���� ������ �ִ� ���� Ŭ������ ��ü�� ������ ��ü �迭�� ���� ����Ѵ�.
		
		Shape[] sha = new Shape[3];
		
		sha[0] = new Circle(5);
		sha[1] = new Rectangle(5, 8);
		sha[2] = new Triangle(10, 15);
		
		for(int i = 0; i < sha.length; i++) {
			sha[i].calcArea();
			System.out.println("������ ���� : " + sha[i].getArea());
		}
	}

}
