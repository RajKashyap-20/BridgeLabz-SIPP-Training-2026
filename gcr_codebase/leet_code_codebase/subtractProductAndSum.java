package gcr_codebase.leet_code_codebase;

public class subtractProductAndSum {
    public int subtractProductAndsum(int n) {
        int sum=0;
        int mul= 1;
        while(n>0){
            int temp= n%10;
            sum+=temp;
            mul*=temp;
            n=n/10;
        }
        return mul-sum;
    }
}
