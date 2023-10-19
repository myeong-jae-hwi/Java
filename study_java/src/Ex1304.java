/*
 	���� �׸��ٰ� �� �� ���� ����, ���� �׸����� �ȱ׸����� ����
 */

// �������̽��� ���� ��� ���� ��

interface Color{
	public static final int Red = 1;
	int Green = 2;
	int Blue = 3;
	
	public abstract void setColor(int c);
	
	int getColor();
	
}

interface Drawable{
	void draw();
}

class Circle2 implements Color, Drawable{
	int color = 0;
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.println("���� �׸���.");
	}
	
	
}


public class Ex1304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle2 cir = new Circle2();
		
		cir.setColor(Color.Red);
		
		switch(cir.getColor()) {
		case Color.Red:
			System.out.println("������");
			break;
		case Color.Green:
			System.out.println("�ʷϻ�");
			break;
		case Color.Blue:
			System.out.println("�Ķ���");
			break;
		}
		
		cir.draw();
		
		
	}

}
