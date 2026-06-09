package com.exc;

import java.util.Scanner;

/*public class Bank{
    int balance = 1000;
    int deposit, withdrawl;
    String ops, decider;
    Scanner sc = new Scanner(System.in);

    public void depositMoney() throws ImporperAmount {
        System.out.println("Enter the amount you want to deposit: ");
        deposit =sc.nextInt();
        if(deposit >=100){
            balance += deposit;
            System.out.println("After depositing your balance is :"+balance);
        }else{
            throw new ImporperAmount("Amount should be greater than 100 Rs");
        }
    }


    public void withdrawlMoney(){
        System.out.println("Enter the amount you want to withdrawl :");
        withdrawl=sc.nextInt();
        if(withdrawl <= balance){
            balance -= withdrawl;
            System.out.println("After withdrawl Your Amount IS:"+balance);
        }else{
            System.out.println("You have Insufficient fund in your account ");
        }
    }

    public void displayBalance()  {
        System.out.println("Your Current balance is: "+balance);
    }

    public void selectOpertion() throws Exception{
        do{
            System.out.println("Enter the operation yout to perform :");
            ops =sc.next();
            if(ops.equalsIgnoreCase("deposit")){
                depositMoney();
            }else if(ops.equalsIgnoreCase("withdrawl")){
                withdrawlMoney();
            }else if(ops.equalsIgnoreCase("displayBalance")){
                displayBalance();
            }
            System.out.println("Do you want to another transaction :");
            decider =sc.next();
        }while(decider.equalsIgnoreCase("Yes"));
    }


    public static void main(String[] args) throws Exception {
        Bank b = new Bank();
        b.selectOpertion();
    }
}*/


/*
public class Bank{
    int balance=1000;
    int deposit,withdrawal;
    String ops,decider;
    Scanner sc = new Scanner(System.in);

    public void DepositMoney() throws ImporperAmount{
        System.out.println("Enter amount you want to deposit : ");
        deposit=sc.nextInt();
        if(deposit >=100){
            balance += deposit;
            System.out.println("After depositing your balence is : "+balance);
        }else{
            throw new ImporperAmount("Amount should greater than 100Rs.");
        }
    }

    public void withdrawal(){
        System.out.println("Enter amount You want withdrawl : ");
        withdrawal=sc.nextInt();
        if (withdrawal <=balance){
            balance -=withdrawal;
            System.out.println("After Withdrawlong your balance is :"+balance);
        }else{
            throw new InsufficientFunds("You have insufficient fund in your account : ");
        }
    }

    public void displayBalance(){
        System.out.println("Current Balance in your Account : "+balance);
    }

    public void selectOperation()throws Exception{
        do {
            System.out.println("Enter the operation do you want to perform:");
            ops=sc.next();
            if (ops.equalsIgnoreCase("deposit")){
                DepositMoney();
            }else if(ops.equalsIgnoreCase("withdrawl")){
                withdrawal();
            }else if(ops.equalsIgnoreCase("displayBalance")){
                displayBalance();
            }
            System.out.println("Do you want another transaction :");
            decider=sc.next();
        }while (decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) throws Exception{
        Bank b= new Bank();
        b.selectOperation();
    }

}*/


public class Bank{
    int balance = 1000;
    int withdrawl,deposit;
    String ops,decider;
    Scanner sc = new Scanner(System.in);

    public void deposit()throws ImporperAmount{
        System.out.println("Enter amount do you want to deposit : ");
        deposit=sc.nextInt();
        if (deposit>=100){
            balance += deposit;
            System.out.println("After depositing your balance is  :"+balance);
        }else {
            throw new ImporperAmount("Amount should greater than 100 Rs.");
        }
    }

    public void withdrawl(){
        System.out.println("Enter the amount do you want to withdraw : ");
        withdrawl=sc.nextInt();
        if (withdrawl <= balance){
            balance -=withdrawl;
            System.out.println("After withdraw your balance is : "+balance);
        }else{
            throw new InsufficientFunds("You have insufficientFunds in your account : ");
        }
    }

    public void displayBalance(){
        System.out.println("Current balance is : "+balance);
    }

    public void selectOperarion() throws Exception{
        do {
            System.out.println("Select operation do you want perform:  ");
            ops=sc.next();
            if (ops.equalsIgnoreCase("deposit")){
                deposit();
            }else if(ops.equalsIgnoreCase("withdrawl")){
                withdrawl();
            }else if(ops.equalsIgnoreCase("displayBalance")){
                displayBalance();
            }
            System.out.println("Do you want to check another transaction:");
            decider=sc.next();
        }while (decider.equalsIgnoreCase("yes"));
    }

    public static void main(String[] args) throws Exception {
        Bank b=new Bank();
        b.selectOperarion();
    }
}

























