import java.util.*;

public class JavaStrings{

    public static void main(String args[]) {
        String S1 = "Simran";
        String S2 = "Simran";
        String S3 = new String("Simran");

        if(S1==S2){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        if(S1.equals(S3)){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
    }
}     