package Practicka;


import lombok.ToString;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        Bank b = new Bank(c);
        Scanner s = new Scanner(System.in);

        int password = 1111 ;
        int login = 1111 ;

        
        while(true){
            System.out.println("Login");
            s.next();
            System.out.println("Password");
            s.nextInt();
            
            
            if(b.confirmPassword(password) && b.confirmLogin(login)){
                b.bankMenu();
            }else {
                System.out.println("Try again");
                b.continueWork();
            }
        }



    }
}



