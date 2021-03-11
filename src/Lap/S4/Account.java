package Lap.S4;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    int id;
    String name;
    double balance;
    ArrayList<Account>Amount;
    public Account(){
        Amount = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void credit(int amount){
        if(amount > 0 ){

            setBalance(getBalance()+amount);
        }

    }
    public void debit(int amount){
        if (amount < getBalance()){
            Amount.remove(amount);
        }
        System.out.println("Không thực Hiện Được");

    }

    public void tranferTo( Account account, int amount){
        if(amount>0&& amount<getBalance()){
            debit(amount);
            account.credit(amount);
        }else{
            System.out.println("Chuyen tien that bai");
        }

    }
}

