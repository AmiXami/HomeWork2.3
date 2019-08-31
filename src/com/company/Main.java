package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) throws LimitExeprion {
    BankAccount amirVisa = new BankAccount();
    double ost = amirVisa.getAmount();
        amirVisa.deposit(10000);
        while (true) {
            try {
                amirVisa.wichDraw(6000);
            } catch (LimitExeprion omaeva) {
                System.out.println("Уважаемый Клиент вам нехвотает средств ");
                omaeva.getMessage();
                amirVisa.wichDraw(ost);
                break;



            }

        }


    }
}
