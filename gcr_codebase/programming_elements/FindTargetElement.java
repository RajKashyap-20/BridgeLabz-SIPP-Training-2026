package gcr_codebase.programming_elements;

import java.util.*;

public class FindTargetElement {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("inter the target");
        int t= sc.nextInt();
        System.out.println("enter the size");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<n; i++){
            if(arr[i]==t){
                System.out.println("target is on "+i+" position");
            }
        }
    }
}
