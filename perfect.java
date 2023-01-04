
import java.util.*;
class perf
{
    public static void main(String args[])
    {
        int a,s=1;
        System.out.print("Enter The Number");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for (int i=1;i<a;i++)
        {
          if(i*i==a)
          {
              System.out.println("Number Is perfect" +i);
          }
        }
    }
}