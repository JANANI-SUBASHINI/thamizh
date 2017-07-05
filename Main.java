# thamizh
import java.io.*;
import java.util.*;
public class Main
{
  
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    int a,sum=0;
    System.out.println("Enter an integer");
    a=Integer.parseInt(br.readLine());
    for(int i=1;i<=a;i++)
    {
      sum=sum+i;
      }
      System.out.println("The natural number is:"+sum);
      }
      }

    
  
