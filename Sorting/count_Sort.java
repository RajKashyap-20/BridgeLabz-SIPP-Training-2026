package Collections_DSA.Sorting;

public class count_Sort {

    public static void main(String[] args) {
        int arr[]= {3,8,6,4,9,6,4,6,7,8,2};
        int max_element=0;
        for(int i:arr){
            if(max_element<i){
                max_element=i;
            }
        }
        int count_arr[]= new int[max_element+1];
        for(int i:arr){
            count_arr[i]++;
        }
        int t=0;
        int res[]= new int[arr.length];
        for(int i=0; i<count_arr.length;i++){
            if(count_arr[i]!=0){
                while(count_arr[i]>0){
                    res[t++]=i;
                    count_arr[i]--;
                }
            }
        }
        for(int k:res){
            System.out.print((k+" "));
        }
    }
}
