//�޼ҵ� �����ε� �� -1
public class Ex903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. �޼ҵ� �����ε�
  ���� : �̹� �����ϴ� �޼ҵ�� �̸��� ������ �Ű����� ������ Ÿ���� �ٸ��� �Ͽ� �ߺ��Ͽ� ������ �� �ִ�.
  ���� : 1. �޼ҵ��� �̸��� ���� �Ű������� ������ Ÿ���� �޶�� �Ѵ�.
  		2. �޼ҵ��� �̸�, �Ű������� ������ Ÿ���� �����ϰ� ���� Ÿ�Ը� �޶󼭴� �޼ҵ� �����ε��� �������� �ʴ´�.
  		
  			ex) int max(int a, int b){
  			
  			}
  			int max(int a, int b, int c){
  			
  			}
  			double max(double a, double b){
  			}
 */
		
		// �ʴ밪 ���ϱ�
		int a = 10, b = 5, c, g;
		double d = 10.2, e = 5.1, f, h;
		
		c = Math.max(a, b);
		System.out.println(c);
		f = Math.max(d, e);
		System.out.println(f);
		
		g = Math.min(a, b);
		System.out.println(g);
		h = Math.min(d, e);
		System.out.println(h);
	}

}
