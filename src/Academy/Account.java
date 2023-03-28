package Academy;

public class Account {
    private int balance ;
    static final int MIN_BALANCE = 0; // 최소값 최대값 상수 선언
    static final int MAX_BALANCE= 1000000;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int value) {

        if (value >=MIN_BALANCE && value <= MAX_BALANCE){
            balance = value;

        }
    }
}
