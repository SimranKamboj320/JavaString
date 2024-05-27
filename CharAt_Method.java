import java.util.*;

public class JavaStrings{

    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        String firstName = "Simran";
        String LastName = "Kamboj";
        String Name = firstName + " " + LastName;
        printLetters(Name);
    }
}   