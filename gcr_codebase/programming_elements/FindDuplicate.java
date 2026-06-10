package gcr_codebase.programming_elements;

import java.util.*;

public class FindDuplicate {
    public static void main(String [] args) {
        int arr[] ={3,5,6,8,5,6,4,3,4,5,9};
        Map<Integer,Integer> count= new HashMap<>();

        for(int i:arr){
            if(count.containsKey(i)){
                int ifreq = count.get(i);
                count.put(i,ifreq+1);
            }
            else{count.put(i,1);
            }
        }
        for(int i:count.keySet()){
            System.out.println(i+"ki freq hai "+ count.get(i));
        }
    }
}
