package nopprojekt;

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
        
    }
    
}
