public class HCF
{
   
    static int gcd(int num1, int num2)
    {
        
        if (num1 == 0)
          return num2;
          
        if (num2 == 0)
          return num1;

        
        if (num1 == num2)
            return num1;
            
       
        if (num1 > num2)
            return gcd(num1-num2, num2);
        return gcd(num1, num2-num1);
    }
  
    public static void main(String[] args)
    {
        int num1 = 98, num2 = 56;
        System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd(num1, num2));
    }
}
