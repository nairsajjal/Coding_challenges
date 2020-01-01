import java.util.*;

public class Main{  
    static String sort(String abc){
        char[] abc_char = abc.toCharArray();
        java.util.Arrays.sort(abc_char);
        return new String(abc_char);        
    }
    
    static boolean isPermutation(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        
        return sort(str1).equals(sort(str2));
    }
    

    
public static void main(String args[]){  
    String str1= "abcdehg";
    String str2= "abcdfge";
    
    if(isPermutation(str1,str2)){
        System.out.println("The strings are a permutation of each other");
    }
    else System.out.println("The strings are NOT a permutation of each other");
    }
    
}