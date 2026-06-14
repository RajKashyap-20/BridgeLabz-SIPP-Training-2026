package gcr_codebase.programming_elements.Strings;

import java.util.*;

public class CompareString {
    public static boolean compare(String s1, String s2){
        boolean b= true;
        for(int i=0; i<Math.min(s1.length(),s2.length()); i++){
            if(s1.charAt(i) != s2.charAt(i))
                b=false;
        }
        return b;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first String:-");
        String s1= sc.next();
        System.out.println("Enter the second String:-");
        String s2 = sc.next();
        System.out.println(compare(s1,s2));
    }
}
