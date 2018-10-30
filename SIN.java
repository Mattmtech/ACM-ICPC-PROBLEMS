package practiceProblems;


import java.util.ArrayList;


public class SIN {

    public static void main(String[] args) {
        ArrayList<Integer> test=new ArrayList<>();
        test.add(124866);
        test.add(111111);
        test.add(987651);
        System.out.println(SIN(test));
    }
    
    public static int SIN(ArrayList<Integer> test)
    {
        int j=1;
        ArrayList<Integer> temp=new ArrayList<>(test);


        while(true)
        {

            for(int i=0;i<test.size();i++)
            {
                temp.set(i, temp.get(i)%j);
            }
            if(check(temp))
            {
                return j;
            }
            temp=new ArrayList<>(test);
            
            j++;

        }
    }
    
    public static boolean check(ArrayList<Integer> temp)
    {
        for(int x=0;x<temp.size();x++)
            {
                for(int y=0;y<temp.size();y++)
                {
                    if(temp.get(x)==temp.get(y) && y!=x)
                    {
                        return false;
                    }
                }
            }
        return true;
    }

}