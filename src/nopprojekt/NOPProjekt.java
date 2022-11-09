package nopprojekt;

public class NOPProjekt {
    public static void backwards(int szam) {
         String szamString = Integer.toString(szam);
         StringBuilder backwardLine = new StringBuilder(szamString);
         backwardLine.reverse();
         String backwardString = backwardLine.toString();
         System.out.println(backwardString);
    }
    public static void main(String[] args) {
    }
    
}
