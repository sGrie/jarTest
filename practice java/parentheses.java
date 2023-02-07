import java.util.Scanner;
import java.util.Stack;


public class parentheses{
    public static boolean isValid(String b, int first, int second) {
        char[] a = b.toCharArray();
        if (a[first] == '(') {
            if(a[second] == ')'){
                return true;
            }else {
                return false;
            }
            
        } else if (a[first] == '{'){
            if(a[second] == '}'){
                return true;
            }else {
                return false;
            }
        } else if (a[first] == '['){
            if(a[second] == ']'){
                return true;
            }else {
                return false;
            }
        } else{
            return false;
        }

   }

    public static void main(String[] args) throws Exception{
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter string:  ");
        String theirString = scnr.nextLine();
        scnr.close();
        int counter = 0;
        boolean end = true;

        if(theirString.length() % 2 == 0){
            while(counter < theirString.length() - 1){
                 if (isValid(theirString, counter, counter + 1)){
                    end = true;
                 } else {
                    end = false;
                    break;
                 }
                
                 counter += 2;
            }
        } else{
            end = false;
        }

        if (end) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}