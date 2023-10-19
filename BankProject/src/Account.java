// 계좌
public class Account {
    // 필드
    private String name;
    private int account_num;
    private int pw;
    private int balance;

    // 디폴트 생성자 메서드
    public Account(){

    }

    // 매개변수 생성자 메서드 (오버로딩)
    public Account(String name, int account_num, int pw, int balance){
        this.name = name;                       // 이름
        this.account_num = account_num;         // 계좌번호
        this.pw = pw;                           // 비밀번호
        this.balance = balance;                 // 잔액
    }

    public int getBalance(){
        return this.balance;
    }

    // 입금
    public void deposit(int money){
        if (money < 0){
            System.out.println("0보다 큰 수를 입력하세요");
            return;
        }
        balance += money;
    }

    // 출금
    public void withdraw(int money){
        if (money < 0){
            System.out.println("0보다 큰 수를 입력하세요");
            return;
        }
        if (balance < money){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= money;
    }

    //고객계좌정보 조회
    public String getAccountInfo(){
        return "예금주명 :" + name +
               ", 계좌번호 :" + account_num +
               ", 비밀번호 :" + pw +
               ", 잔고 :" + balance;
    }

    //계좌번호 조회
    public int getAccountNumber(){
        return account_num;
    }
}
