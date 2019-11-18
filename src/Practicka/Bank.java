package Practicka;

import java.util.Scanner;

public class Bank {
    private Client client;

    public Bank() {
    }

    public Bank(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "client=" + client +
                '}';
    }

    public boolean confirmPassword(int password){
        if(password ==client.getPassword()){
            return true;
        } else {
            return false;
        }
   }
   public boolean confirmLogin(int login){
        if(login == client.getLogin()){
            return true;
        }else {
            return false;
        }
    }

    public void continueWork(){
        Scanner s = new Scanner(System.in);
        System.out.println("Continue - 1, Exit - 2 :");
        while(true){
            int x = s.nextInt();
            if(x == 2){
                System.out.println("Bye Bye");
                System.exit(0);
            }else if(x == 1){
                break;
            }else {
                System.out.println("Continue - 1, Exit -2 :");
            }
        }
    }

    public void bankMenu(){
        System.out.println();
        System.out.println("Accaunt status - 1 :");
        System.out.println("Take a money - 2 :");
        System.out.println("Put a money - 3 :");
        System.out.println("Exit - 4 :");
        Scanner s = new Scanner(System.in);

        switch (s.nextInt()){
            case 1:
                System.out.println("For your accaunt" + client.getCount());
                break;
            case 2 :
                System.out.println("What sum you want take?");
                int getSum = s.nextInt();
                if(getSum > client.getCount()){
                    System.out.println("You havent money!");
                    break;
                }else {
                    client.setCount(client.getCount() - getSum);
                    System.out.println("In your accaunt now" + client.getCount());
                    break;
                }
            case 3:
                System.out.println("How much money you want put? :");
                int setMoney = s.nextInt();
                client.setCount(setMoney + client.getCount());
                System.out.println("In your accaunt now" + client.getCount());
                break;
            case 4:
                System.out.println("Bye bye");
                System.exit(0);

        }

        System.out.println();
        continueWork();


tyuio

    }
}
