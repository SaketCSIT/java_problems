import java.util.*;
import java.lang.Math;
class game
{
    public static void main(String args[])
    {
        int input,attempts;
        int max=1,min=999;
        Scanner sc=new Scanner(System.in);

        int num=(int)(Math.random()*(max-min+1)+min);
        for (attempts=1;attempts<=5;attempts++)
        {
            System.out.println("Enter The Number");
            input=sc.nextInt();
            System.out.println("Attempts");
            if (attempts==5)
            {
                break;

            }
           else if (input==num)
            {
                System.out.println("Congratulations you won");
            }
            else if (input<num)
            {
                System.out.println("to small");
            }
            else
            {
                System.out.println("to large");
            }
        }

    }
}