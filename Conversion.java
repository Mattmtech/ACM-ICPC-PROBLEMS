package practiceProblems;




import static javax.xml.bind.DatatypeConverter.parseDouble;
import static javax.xml.bind.DatatypeConverter.parseString;

public class Conversion
{
    public static void main(String[] string)
    {
        String test = "300 cubits";
        String test2 = "2 cubits 1 palm 2 digits";
        String test3 = "3 palms 3 digits";
        String test4 = "1 cubit 2 digits";
        converter(test);
        converter(test2);
        converter(test3);
        converter(test4);
    }
    
    public static void converter(String string)
    {

        double sum1 = 0;
        double sum2 = 0;
        double cubit = 0.52635;
        double palm = cubit/7.0;
        double digit = palm/4.0;
        String Storage[];
        String Final[];
        String names[] = new String[100];
        Double numbers[] = new Double[100];
        int count = string.length();
    Storage = string.split("\\s+");
        for ( int i = 0; i < Storage.length; i++)
        {  
           if (i % 2 == 0)
           {
               numbers[i] = parseDouble(Storage[i]);
           }
           else
           {
               names[i-1] = parseString(Storage[i]);
           }
        }
        
        
        
        for ( int i =0; i < count; i ++)
        {
            if ( "cubit".equals(names[i]) )
            {
               sum1 += numbers[i] * cubit; 
            }
             if ( "cubits".equals(names[i]))
            {
                sum1 += numbers[i] * cubit;
            }
             if ( "palm".equals(names[i]))
            {
                 sum1 += numbers[i] * palm;
            }
             if ("palms".equals(names[i]))
            {
                 sum1 += numbers[i] * palm;
            }
             if ("digit".equals(names[i]))
            {
                 sum1 += numbers[i] * digit;
            }
             if ("digits".equals(names[i]))
            {
                 sum1 += numbers[i] * digit;
            }  
        }
        sum2 = sum1* 3.2805;
        //System.out.println(sum2);
        double inch = sum2 - Math.floor(sum2);  
        //System.out.println(inch);
        int foot = (int) Math.floor(sum2);
        //System.out.println(foot);
        
        inch = inch * 12.0;
        inch =  Math.round(inch * 1000.0) / 1000.0;
        //System.out.println(inch);
        sum1 = Math.round(sum1 * 1000.0) /1000.0;
       double rounded = (double) Math.round(inch * 100) / 100;
         if(foot >= 1.0)
         {
             
       System.out.println(sum1 + "m "+foot + "' " + rounded + "''");
         }
         else
         {
             System.out.println(sum1 + "m " + rounded + "''");
         }

        
    }
    
}

