import java.util.Scanner;

public class Divide {
    // Function to divide a by b 
    static int divide(int dividend, int divisor)
    {
        // Calculate sign of divisor i.e., sign will be negative only iff either one of them is negative otherwise it will be positive
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
     
        // Update both divisor and dividend positive
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
     
        // Initialize the quotient
        int quotient = 0;
         
        while (dividend >= divisor)
        {
            dividend -= divisor;
            ++quotient;
        }
     
        return sign * quotient;
    }   
     
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println(divide(a, b));
    }
}
