// �л��� ���� Ŭ������ ������ ������ ��ü ����

class Student{
	String name;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("�л��̸� : " + this.name);
	}
	
}


public class Ex1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	2. ������
 	- ���� : ��ü�� ������ �� �ʿ��� �۾��� �����ϴ� Ư���� �޼ҵ�
 	
 		ex) Student stu = new Student("ȫ�浿");
 	
 			class Student{
 				String name;
 				
 				public Student(){
 					
 				}
 				
 				public Student(String name){
 					this.name = name;
 				}
 				
 				public void setName(String name){
 						this.name = name;
 				}
 				
 				public String getName(){
 					return this.name;
 					}
 				
 			}
 	
 */
		
		Student stu = new Student("ȫ�浿");
		
		stu.print();
		
		System.out.println("�л��̸� : " + stu.getName());
		
		stu.setName("������");
		
		System.out.println("�л��̸� : " + stu.getName());
		
	}

}
