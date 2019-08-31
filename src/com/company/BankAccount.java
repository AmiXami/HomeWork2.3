package com.company;

import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    double amount;

    double getAmount(){

        return amount ;
    }

    void deposit(double sum) {
        System.out.println("Вы открыли Депозит на сумму = " + sum);
        amount = amount + sum;
    }
    void wichDraw(double sum)

            throws LimitExeprion{
        System.out.println("Вы сняли сумму в размере - " + sum);
        if (amount < sum){
        throw new LimitExeprion("На вашем балансе не хвотает средств", + amount);
        }

        amount = amount - sum;





    }

}



