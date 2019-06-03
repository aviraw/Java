//WAP TO FIND ORDER OF ENERGY ACCORDING TO (n+l)rule of Aufbau upto any no of orbital
package ImpossibleZone;
import java.io.*;
class OrderofENERGY
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("ENTER VALUE OF N :");
        int n=Integer.parseInt(br.readLine());
        String a[][]=new String[n][n];
        String s[]={"s","p","d","f","g","h","i","j","k","l","m","n","o","q","r","t","u","v","w","x","y","z","a","b","c","e"};
        
        int size=0;
        for(int i=1;i<=n;i++)
        size+=i;
   
        int value[]=new int[size];
        String orbital[]=new String[size];
        int top=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                a[j][i]=s[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]==null?" ":(i+1)+a[i][j]+" ");
            System.out.println();
        }
        
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=null)
                {
                value[top]=(i+1)+j;
                orbital[top]=String.valueOf(i+1)+s[j];
                top++;
                }
            }
        }
         
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(value[j]>value[j+1])
                {
                    int t=value[j];
                    value[j]=value[j+1];
                    value[j+1]=t;
                    String tn=orbital[j];
                    orbital[j]=orbital[j+1];
                    orbital[j+1]=tn;
                }
            }
        }
        
        System.out.println("ORDER OF ENERGY>>");
         for(int i=0;i<size;i++)     
          {
            System.out.print(orbital[i]+",");
        }
        System.out.println("\nORDER IN REALITY>>");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                 System.out.print(a[i][j]==null?" ":(i+1)+a[i][j]+",");
            }
        }
        }
    }
