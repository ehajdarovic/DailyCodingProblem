
public class Main {
     public static void main(String[] args) {

         int num=15;//other test value=56
         int[] coins={5,8};//other test array {1,5,10}
         int result=coins(coins,num);
         System.out.println(result);
    }

    public static int coins(int[] c,int num){

         int amount=0;//the amount of coins needed
         int rem;//will be used to store remainder

         for(int i=c.length-1;i>=0;i--){
             //start dividing coin values starting at highest value coin
             //reset values for each iteration
             amount=0;
             rem=num;

             for(int j=i;j>=0;j--) {
                 while (rem >= c[j]) {
                     rem -= c[j];//remaining of div will be remainder
                     amount++;
                 }
                 if(rem==0)//means satisfactory combo was found
                     return amount;
             }
         }
         return -1;//no combo of coins was found
    }
}
