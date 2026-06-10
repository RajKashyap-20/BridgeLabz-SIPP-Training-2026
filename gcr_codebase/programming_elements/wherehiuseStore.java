package gcr_codebase.programming_elements;

import java.util.Scanner;

public class wherehiuseStore {
    public static int max(int []arr){
        int m=0;
        for(int i:arr){
            if(i>m){
                m=i;
            }
        }
        return m;
    }

    public static int min(int []arr){
        int m=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<m){
                m=i;
            }
        }
        return m;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("maximum stock is "+max(arr) +" minimum stock is "+ min(arr));
    }
}
