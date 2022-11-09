package nopprojekt;

import java.util.Scanner;

public class NOPProjekt {

    
    public static void main(String[] args) {

        Scanner bill = new Scanner(System.in);
        
        do {
        System.out.print("Szökőév évszám: ");
        int evSzam = bill.nextInt();
        }
        while(!isLeapYear(evSzam));
        
        System.out.println(backwards(evSzam));
    }
    
}
