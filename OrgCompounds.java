//WAP TO IUPAC NAME OF ANY CHEMICAL COMPOUND ON THE BASIS OF ITS MOLECULAR FORMULA
//WRITE IUPAC NAME OF ALL POSSIBLE STRUCTURES
//USE DBE

package ImpossibleZone;

import java.io.*;
class OrgCompounds
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
        String n[]={"","Meth","Eth","Prop","But","Pent","Hex","Hept","Oct","Non","Dec","11","Dodec","Tridec","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","","","","","","","","","","","","","","","",""};
        
        System.out.println("Enter molecular formula of any organic compound :");
        System.out.println("single bond   \n Double bond = \n Triple ~");
        String s=br.readLine().toUpperCase().trim();
        int l=s.length();
        int c=0,h=0,che,h2=0,c2=0,d=0;
        String A="",B="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='C')
             c=((int)s.charAt(i+1))-48;
            if(ch=='H')


        A=n[c];
        che=c*2;
        if(che+2==h)
        B="ane";
        if(che==h)
        B="ene";
        if(che-2==h)
        B="yne";
        System.out.println(A+""+B);
    }
}}
        