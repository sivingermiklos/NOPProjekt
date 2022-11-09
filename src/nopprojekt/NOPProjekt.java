package nopprojekt;

import java.util.Scanner;

public class NOPProjekt {

    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0){
            return true;
        }
        else if (year % 400 == 0){
            return true;
        }
        
        return false;
    }
    
    
    public static void main(String[] args) {


        Scanner bill = new Scanner(System.in);
        int evSzam;
        
        do {
        System.out.print("Szökőév évszám: ");
        evSzam = bill.nextInt();
        }
        while(!isLeapYear(evSzam));
        
        System.out.println(backwards(evSzam));
    }
    
}
