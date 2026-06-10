package gcr_codebase.leet_code_codebase;

public class numberOfSteps {
    public int numberOfSteps(int num) {
        int res=0;
        while(num>0){
            if (num%2==0){
                num/=2;
                res++;
            }
            else{
                num-=1;
                res++;
            }
        }
        return res;
    }
}
