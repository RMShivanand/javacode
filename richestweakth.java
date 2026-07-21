package DSA;

public class richestweakth {

    // You are given an m x n integer grid accounts where accounts[i][j] 
    // is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. 
// The richest customer is the customer that has the maximum wealth.
    public static void main(String[] args) {
        int[][] accounts={
            {1,2,3},
            {1,2,3}
        };
        int ans = maxwealth(accounts);
        System.out.println("The reachest wealthy man has the wealth: " +ans);
    }
    static int maxwealth(int[][] accounts){
        int maxvalue = 0;
        for(int i =0;i<accounts.length;i++){
            int wealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                wealth += accounts[i][j];
            }
            if(wealth>maxvalue){
                maxvalue = wealth;
            }
        }
         return maxvalue;
    }
   
}
