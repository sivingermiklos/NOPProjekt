package nopprojekt;

import java.util.Scanner;

public class NOPProjekt {

    public static void backwards(int szam) {
         String szamString = Integer.toString(szam);
         StringBuilder backwardLine = new StringBuilder(szamString);
         backwardLine.reverse();
         String backwardString = backwardLine.toString();
         System.out.println(backwardString);
    }

    public static boolean isLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
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
        
        backwards(evSzam);
    }
    
}
