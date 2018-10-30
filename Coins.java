package practiceProblems;



public class Coins {

    public static void main(String[] args) {
        coins(35,1);
        coins(1,0);
        coins(18,3);
        coins(60,0);
    }

    public static void coins(int amount, int hda) {
        int[] coins = new int[5];
        int[] temp={50,25,10,5,1};
        while (amount != 0) {
            if (amount >= 50 && hda > 0) {
                coins[0] = amount / 50;
                amount = amount % 50;
            }
            if (amount >= 25) {
                coins[1] = amount / 25;
                amount = amount % 25;
            }
            if (amount >= 10) {
                coins[2] = amount / 10;
                amount = amount % 10;
            }
            if (amount >= 5) {
                coins[3] = amount / 5;
                amount = amount % 5;
            }
            else {
                coins[4] = amount / 1;
                amount = amount % 1;
            }

        }
        
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]!=0)
            {
                System.out.print(coins[i]+ "x"+temp[i]+ " ");
            }
        }
        System.out.println(" ");
    }

}