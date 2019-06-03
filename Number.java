package ImpossibleZone;

/*WAP TO ENTER A NO. 
 * AND WRITE IT IN ALPHABETICAL FORM */

import java.io.*;
class Number
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String no[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String place[]={"","",""," hundred"," thousand"," thousand"," lac"," lac"," crore"," crore"," arab"," arab"}; 
      
        int n=0;
        do{
             try
        {
                   
      String f="";
        System.out.println("Enter the number within crores (-1 to exit)");
        n=Integer.parseInt(br.readLine());
        int t=n,c=0,x=1;
        while(t!=0)
        {
            t/=10;
            c++;
        }
        t=n;
        while(t!=0)
        {
          
            int d=t%10;  System.out.println("d is "+d);
            int k=(t%100)/10; System.out.println("k is "+k);
            if(x==3)
            k=0;
             if(k==1)
                f=" "+no[t%100]+place[x]+f;
            else if(k==0&&d!=0)
                 f=" "+no[d]+place[x]+f;
           else if(d==0&&k==0){}
            else
                f=" "+no[k+18]+no[d]+place[x]+f;
                
            if(x!=3)
            {
            t=t/100;
             x+=2;
            }
            else
            {
                t=t/10;
                x++;
            }
             System.out.println("x is "+x);
        }
        System.out.println(c+"NUMBER NAME IS : "+f);
        
    }catch(Exception e){
        System.out.println("SORRY THERE APPEARS TO BE SOME ERROR "+ e);
    }
    
}while(n!=-1);
}
}