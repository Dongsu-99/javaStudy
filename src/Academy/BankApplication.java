package Academy;

import java.util.Scanner;

public class BankApplication {
    private static Account1[] accountArray = new Account1[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.에금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택 >");

            int selectNo = sc.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void withdraw() {
        System.out.println("-----");
        System.out.println("출금");
        System.out.println("-----");

        System.out.print("계좌번호 :");
        String ano = sc.next();
        System.out.print("출금액:");
        int balance = sc.nextInt();

        Account1 account = findAccount(ano);
        if (account ==null) {
            System.out.println("계좌번호가 없습니다");
        }else{
            int sum = account.getBalance() - balance;
            account.setBalance(sum);
            System.out.println("출금완료");
        }
    }

    private static void deposit() {
        System.out.println("-----");
        System.out.println("예금");
        System.out.println("-----");

        System.out.print("계좌번호");
        String ano = sc.next();
        System.out.print("예금액:");
        int balance = sc.nextInt();

        Account1 account = findAccount(ano);
        if (account ==null) {
            System.out.println("계좌번호가 없습니다");
        }else{
            int sum = account.getBalance() + balance;
            account.setBalance(sum);
            System.out.println("입금완료");
        }
    }

    private static void accountList() {
        System.out.println("-----");
        System.out.println("계좌목록");
        System.out.println("-----");

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null)
                break;

            Account1 a = accountArray[i];

            System.out.printf("%10s %10s %10d\n", a.getAno(),a.getOwner(),a.getBalance());
        }
    }

    private static void createAccount() {
        System.out.println("-----");
        System.out.println("계좌생성");
        System.out.println("-----");

        String result = "결과 : 계좌가 생성되었습니다";

        String ano = sc.next();
        System.out.print("계좌번호 :" + ano);

        String owner = sc.next();
        System.out.print("계좌주 : " + owner);

        int balance = sc.nextInt();
        System.out.print("초기입금액 :" + balance);


        int index = 0;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                index = i;
                break;
            }
        }

        Account1 account = new Account1(ano, owner, balance);
        accountArray[index] = account;
        System.out.println(result);

    }

    private static Account1 findAccount(String ano) {
        Account1 account = null;

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null)
                break;

            if (accountArray[i].getAno().equals(ano)) {
                account = accountArray[i];
                break;
            }
        }

        return account;
    }

}
