import java.util.*;
public class lengthnumber {
    public static void main(String args[])
    {
        int no=250,length=0;
        int clone=no;
//        System.out.println("Enter The number");
//        Scanner sc= new Scanner(System.in);
//        no=sc.nextInt();
        while (clone!=0)
        {
            length+=1;
            clone/=10;

        }
        System.out.println(length);
    }
}
