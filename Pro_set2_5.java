import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
class Pro_set2_5
{
    public static void main(String[] args)throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--)
        {
          System.out.println(a[i]);
        }
    }
}