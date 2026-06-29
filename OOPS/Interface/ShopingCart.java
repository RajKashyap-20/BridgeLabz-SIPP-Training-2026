package OOPS.Interface;

import java.util.Scanner;

interface CouponValidator {

  boolean validateCoupon();         //Abstract method
    static boolean islengthvalid(String code){
        boolean b=true;
        if(code.length() != 6) b=false;
        return b;

    }
}

public class ShopingCart{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String[] str= new String[n];
        for(int i=0; i<str.length;i++){
            str[i]=sc.nextLine();
        }
    }

}
