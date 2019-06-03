package ImpossibleZone;

import java.io.*;
class TimeTell
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        {
            do
            
            
            {
            String n[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
            System.out.println("Enter HOURS (x-EXIT)");
            
            String e =br.readLine();
            if(e.equals("x"))
            break;
            int h=Integer.parseInt(e);
            System.out.println("Enter MINUTES");
            int m =Integer.parseInt(br.readLine());
            
            String A="",B="",C="",temp="";
            int x=1,t,d;
            
            if(m==30)
            A="Half";
            else if(m==15||(60-m)==15)
            A="Quater"; 
               else if(m==0)
            {
                System.out.println(n[h-1]+" O'clock"); 
           
            }
               else if(m==60)
            {
                System.out.println(n[h]+" O'clock"); 
         
            }
            else if(m!=0&&m!=60)
            {
                if(m>30)
                {
                   
                    if((60-m)<=20)
                    A=n[(60-m-1)]+" minutes";
                    else
                    {
                        t=60-m;
                        while(t!=0)
                        {
                            d=t%10;
                            temp=n[(d*x)-1]+" "+temp;
                            x=x*10;
                            t=t/10;
                        }
                        A=temp+" minutes";
                    }
                }
                else
                {
                    
                    if(m<=20)
                    A=n[m-1]+" minutes";
                   else
                    {
                        t=60-m;
                        while(t!=0)
                        {
                            d=t%10;
                            temp=n[(d*x)-1]+" "+temp;
                            x=x*10;
                            t=t/10;
                        }
                        A=temp+" minutes";
                    }
                }
            }
            
            if(m>30 && m!=0&&m!=60)
            {
                B="to";
                C=h>=12?n[h-12]:n[h];
            }
            else 
            {
                if(m!=0&&m!=60)
                {
                 B="past";
                 C=h-1>=12?n[h-1-12]:n[h-1];
                }
            }
            System.out.println("\n\n"+A+" "+B+" "+C);
                
                        
            
            
        
    }while(true);
    }
}}
