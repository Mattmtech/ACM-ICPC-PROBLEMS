package practiceProblems;


public class TriangleNumber {

    public static void main(String[] args) {
        System.out.println(tri(55));
        System.out.println(tri(1));
        System.out.println(tri(587));
        System.out.println(tri(499500));
    }
    
    public static String tri(int n)
    {
        int sum=1; 
        int i=2;
        String x="";
        int temp=0;
        while(sum<=n)
        {
            if(n==sum){
                temp=i-1;
                x=Integer.toString(temp);
                return x;
            }
            sum=sum+i;
            i++;
        }
        return "bad";
    }
    
}

