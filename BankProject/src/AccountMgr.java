import java.util.Scanner;

public class AccountMgr {

    // 최대 계좌 개설 가능 수: 100개
    private static Account[] accounts = new Account[100];
    private static int idx = 0;

    // 계좌 확인
    public static int retrieveIndexByAccountNumber(int account_num){
        for(int i = 0; i < idx; i++){

            System.out.println(accounts[i].getAccountNumber());

            if(accounts[i].getAccountNumber() == account_num) {
                return i;
            }
        }
        return -1;
    }

    // 계좌 개설
    public static void createAccount(){
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.print("이름: ");
        String name = scan.nextLine();

        System.out.print("계좌번호: ");
        int account_num = scan.nextInt();

        System.out.print("비밀번호: ");
        int pw = scan.nextInt();

        System.out.print("금액: ");
        int balance = scan.nextInt();
        
        accounts[idx] = new Account(name, account_num, pw, balance);
        idx++;
 
        System.out.println("고객 계좌가 개설되었습니다.");
    }

    // 잔액 조회
    public static void retrieveBalance(){
        Scanner scan = new Scanner(System.in);
        System.out.println("계좌번호: ");
        int accountNum = scan.nextInt();

        int idx = retrieveIndexByAccountNumber(accountNum);
        if(idx != -1){
            System.out.printf("%d 원 있습니다.%n", accounts[idx].getBalance());
        }else{
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
    }

    // 입금
    public static void checkIn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("계좌번호: ");
        int accountNum = scan.nextInt();
        System.out.println("입금액: ");
        int money = scan.nextInt();

        int idx = retrieveIndexByAccountNumber(accountNum);
        if(idx != -1){           
            accounts[idx].deposit(money);
        }else{
            System.out.println("계좌번호가 존재하지 않습니다.");
        }
    }

    // 전체 계좌 조회
    public static void retrieveAccountList(){
        for(int i=0; i < idx; i++){
            System.out.printf("%s%n", accounts[i].getAccountInfo());
        }
    }

    public static void main(String[] args) {
        Account[] obj = new Account[10];

        Scanner scan = new Scanner(System.in, "UTF-8");
        boolean isExit = false;
        do{
            try {
            // 2초 동안 딜레이
            Thread.sleep(2000);
            } catch (InterruptedException e) {
            // 예외 처리
            e.printStackTrace();
            }
            System.out.println("====== 은행 입출금 관리 시스템 ======");
            System.out.println("1. 계좌 개설");
            System.out.println("2. 잔액 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 전체고객계좌조회");
            System.out.println("6. 종료");
            System.out.println("항목을 선택하세요");

            int menu = scan.nextInt();
            switch(menu){
                case 1:
                    System.out.println("계좌 개설");
                    createAccount();
                    break;
                case 2:
                    System.out.println("잔액 조회");
                    retrieveBalance();
                    break;
                case 3:
                    System.out.println("입금");
                    checkIn();
                    break;
                case 4:
                    // System.out.println("출금");
                    // checkOut();
                    // break;
                case 5:
                    System.out.println("전체고객조회");
                    retrieveAccountList();
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");

            }
        }while(!isExit);
    }
}