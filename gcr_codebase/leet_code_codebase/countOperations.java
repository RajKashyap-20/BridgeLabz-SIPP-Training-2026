package gcr_codebase.leet_code_codebase;

public class countOperations {
    public int countOperations(int num1, int num2) {
        int ans =0;
        while(num1>0 && num2>0){
            if(num1 >= num2){
                num1-=num2;
                ans++;
            }
            else{
                num2-=num1;
                ans++;
            }
        }
        return ans;
    }
}
