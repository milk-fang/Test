package com.wz.java3;

/**
 * 类描述
 *
 * @ClassName AccountTest
 * @Description TODO
 * @Author vip
 * @Date 2020/9/10 13:42
 * @Version 1.0
 */
class Account{

    private double balance;

    public Account(){}
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Customer extends Thread{
    private Account acct;
    public Customer(Account acct){
        this.acct = acct;
    }

    @Override
    public synchronized void run() {
//        super.run();
        for(int i = 0; i < 3; i++){
            acct.setBalance(acct.getBalance() + 1000);
            System.out.println("当前余额：" + acct.getBalance());
        }
    }
}


public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account();
        Customer c1 = new Customer(acct);
        Customer c2= new Customer(acct);
        c1.setName("客户甲");
        c2.setName("客户乙");

        c1.start();
        c2.start();
    }
}
