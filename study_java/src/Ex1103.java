
public class Ex1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  2. ���� ������
  
  - ���� ��Ű���� ���(A package)
  
  	: ���� Ŭ����
  	ex) class Account{
  			public String name;
  			protected Date open; => DateŬ���� : import java.util.Date;
  			// /*package*/ //int number;
			// private long balance;
//  	}
  	/*
  	: ��ӹ޴� Ŭ����(extends ����� ���)
  	ex) public class savingAccount extends Account{
  		- ����Ŭ����(savingAccount)�� ����� ���� ���� Ŭ����(Account)�� public,
  		protected, default ���ٰ���
  		- private�� ������ �Ұ���
  	}
  	  	
  	: �Ϲ� Ŭ����(extends�� ������� �ʴ� ���)
  	ex) public class AccountTest {
  		- ����Ŭ����(AccountTest)�� ����� ���� �ʾƵ� ���� ��Ű������ ���� �ϱ� ������
  		  public, protected, default ���ٰ���
  		- private�� ������ �Ұ���
  	}
  	
  	
  	
  - ���� ��Ű���� �ƴ� ���(B package)
  	: ��ӹ޴� Ŭ����(extends ����� ���)
  	ex) public class CheckAccount extends Account{
  		- ���� ��Ű��(A Package)�� �ƴ� ����Ŭ����(CheckAccount)�� public, protected ���ٰ���
  		- default, private�� ������ �Ұ���
  	
  	: �Ϲ� Ŭ����(extends�� ������� �ʴ� ���)
  	ex) public class CheckTest {
  		- ���� ��Ű��(A Package)�� �ƴ� ����Ŭ����(CheckTest)�� public ���ٰ���
  		- protected, private, default ���� �Ұ���
  		
  	=======================================================================================
  	������	Ű����	Ŭ��������				���� ��Ű��(A package)			�ٸ���Ű��(B package)
  	 ����								���� Ŭ����(���)	�Ϲ�Ŭ����		���� Ŭ����(���)	�Ϲ�Ŭ����
  	=======================================================================================
  	1		public		����				����				����			����				����
  	2		protected	����				����				����			����				�Ұ���
  	3		default		����				����				����			�Ұ���			�Ұ���
  	4		private		����				�Ұ���			�Ұ���		�Ұ���			�Ұ���
  		  	
 */
	}

}
