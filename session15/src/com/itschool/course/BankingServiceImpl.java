package com.itschool.course;

public class BankingServiceImpl implements BankingService{
    @Override
    public void pay() {
        System.out.println("paying");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw");
    }
}
