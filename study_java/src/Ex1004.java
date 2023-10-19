class CreditCard{
	public String owner;
	private long number;
	
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getNumber() {
		return this.number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	public CreditCard() {
		
	}
	
	public CreditCard(String owner) {
		this.owner = owner;
	}
	
	public CreditCard(long number) {
		this.number = number;
	}
	
	public CreditCard(String owner, long number) {
		this.owner = owner;
		this.number = number;
	}
	
	public void print() {
		System.out.print("ī������� : " + this.owner + "   ");	
		System.out.println("ī���ȣ : " + this.number);
	}
	
	public void printOnwer() {
		System.out.print("ī������� : " + this.owner);
		System.out.print("   ");
	}
	
	public void  printNumber() {		
		System.out.println("ī���ȣ : " + this.number);
	}

}

public class Ex1004 {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		/*
		 3. ������ �����ε�
		 - ���� : �ϳ��� Ŭ�������� ���ڰ� �ٸ��� �����ڸ� ���� ���� ���� �� �ִ�.
		   ex)
		   		class CreditCard{ 
		        	public String owner; //ī�� ������
		        	private long  number; // 16�ڸ� ī�� ��ȣ
		        
		        	public CreditCard(){}
		        	public CreditCard(String owner){
		        			this.owner = owner;
		        	}
		        	public CreditCard(long number){
		        			this.number = number;
		        	}
		        	public CreditCard(String owner, long number){
		        			this.owner = owner;
		        			this.number = number;
		        	}	        	
		        	
		        }
		        
		 */
		
		CreditCard card1 = new CreditCard("���ص�");
		CreditCard card2 = new CreditCard(3425_4587_2345_9845L);
		
		card2.owner = "�Ǽ���";
		
		CreditCard card3 = new CreditCard("�̴���", 5638_8627_8623_9811L);
		
		System.out.println("card1�� ������ : " + card1.owner + "   " + "card1�� ī���ȣ : " + card1.getNumber());
		System.out.println("card2�� ������ : " + card2.owner + "   " + "card2�� ī���ȣ : " + card2.getNumber());
		System.out.println("card3�� ������ : " + card3.owner + "   " + "card3�� ī���ȣ : " + card3.getNumber());
		
		System.out.println();
		
		card1.printOnwer();
		card1.printNumber();
		card2.printOnwer();
		card2.printNumber();
		card3.printOnwer();
		card3.printNumber();
		
		System.out.println();
		
		card1.print();
		card2.print();
		card3.print();
		
		
		
	}

}
