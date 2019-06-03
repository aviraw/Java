//WAP TO PRINT TRUTH TABLE OF N Linearly
//N IS NUMBER OF INPUT LINES
package ImpossibleZone;
import java.io.*;
class TRUTH_TABLE_4
{
   static int c=0;//,c=2*((m-t)/m)
   static int arr[][];
   public static void f(int t,int n)
   {
      
       int m=(int)Math.pow(2,n);
        int r=0;
       if(t!=1)
       {
           
           for(int y=1;y<=(m/t);y++)
           {
        for(int x=1;x<=t;x++)
        {
          if(x>(t/2))
          {
          //System.out.print("1");
          arr[r][c]=1;
          r++;
          }
          else if(x<=(t/2))
          {
         // System.out.print("0");
           arr[r][c]=0;
           r++;
          }
        }
           }
            c++;
       }
       else
       {System.out.println(" ");    }
    }
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter n");
            int n=Integer.parseInt(br.readLine());
            int t=(int)Math.pow(2,n);
           arr=new int[t][n];
            for(int i=0;i<t;i++)
             {
                 for(int j=0;j<n;j++)
                 {
                     arr[i][j]=-1;
                    }
                }
          
            for(int i=t;i>0;i=i/2)
            {
                f(i,n);
                System.out.println(" ");
            }
           System.out.println("===================================================================================================================");
           for(int x=0;x<n;x++)
           System.out.print((char)(x+65)+"\t");
           System.out.println();
            for(int i=0;i<t;i++)
             {
                 for(int j=0;j<n;j++)
                 {
                       System.out.print(arr[i][j]+"\t");
                    }
                      System.out.println();
                }
        }
    }
