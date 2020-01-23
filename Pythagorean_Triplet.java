
import java.util.Scanner;


public class Pythagorean_Triplet 
{
    static boolean isTriplet(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int x=arr[i]*arr[i],  y=arr[j]*arr[j], z=arr[k]*arr[k];
                    if(x == y+z ||y == z+x ||z == x+y)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int arr1[]=new int[a];
            for(int j=0;j<a;j++)
            {
                arr1[i]=sc.nextInt();
                isTriplet(arr1,a);
            }
            if(isTriplet(arr1,a)==true)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
