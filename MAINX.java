package ImpossibleZone;
//print this horizontally
import java.util.*;
import java.io.*;
class MAINX

{    

public  void A(int n)
{
for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||y==1||y==n||x==(n/2))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void B(int n)
{
    
for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1&&y!=n||x==n&&y!=n||y==1||y==n&&x!=n&x!=1&&x!=(n/2)||x==(n/2))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void C(int n)
{
    
for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||y==1||x==n)
{
System.out.print("#");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
public  void D(int n)
{
        
for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1&&y!=n||x==n&&y!=n||y==1||y==n&&x!=n&&x!=1)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void E(int n)
{
        
for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||x==n||y==1||x==n/2&&y!=n)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void F(int n)
{

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||y==1||y==1||x==n/2&&y!=n)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void G(int n)
{

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||y==1||x==n||y==n&&x>=(n/2)||x==(n/2)&&y>=(n/2))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void H(int n)
{

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==n/2||y==1||y==n)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void I(int n)
{

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||y==n/2||x==n)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void J(int n)
{

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||y==n/2||x==n&&y<=n/2||y==1&&x>=n/2)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void K(int n)
{

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(y==1||x+y==n&&x<=n/2||x==y&&x>=n/2)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}

public  void L(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(y==1||x==n)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void M(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(y==1||y==n||((x==y||(x+y)==(n+1))&&(x<=n/2)))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void N(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(y==1||y==n||x==y)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void O(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if((x==1||y==1||x==n||y==n)&&(x!=y)&&((x+y)!=(n+1)))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void P(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if((y==1||x==1||x==n/2||(y==n&&x<(n/2)))&&!(x==1&&y==1)&&!(x==n/2&&y==n)&&!(x==1&&y==n))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void Q(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if((x==1||y==1||x==n||y==n)&&(x!=y)&&((x+y)!=(n+1))||((x==y)&&x>n/2))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void R(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if((y==1||x==1||x==n/2||(y==n&&x<(n/2)))&&!(x==1&&y==1)&&!(x==n/2&&y==n)&&!(x==1&&y==n)||((x==y)&&x>n/2))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void S(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==n||x==1||x==n/2||(x<n/2&&y==1)||(x>n/2&&y==n))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void T(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||y==n/2)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void U(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(y==1||y==n||x==n)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void V(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(((y==1||y==n)&&x!=n)||(x==n&&y!=1&&y!=n))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void W(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(y==1||y==n||(x==y&&y>n/2)||((x+y==n+1)&&y<n/2))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void X(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==y||(x+y==n+1))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void Y(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if((x==y&&y<n/2)||((x+y==n+1)&&y>n/2)||(y==n/2)&&x>n/2)
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}
public  void Z(int n){

for(int x=1;x<=n;x++)
{
for(int y=1;y<=n;y++)
{
if(x==1||x==n||(x+y==n+1))
System.out.print("#");
else
System.out.print(" ");
}
System.out.println();
}
}

public static void main(String args[])throws Exception
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
{
MAINX ob=new MAINX();
System.out.println("THIS PROGRAM IS AN ADJUSTABLE Sentence pattern");
System.out.println("ENTER SIZE");
int n=Integer.parseInt(br.readLine());
System.out.println("Enter any STRING");
String v=br.readLine();
v=v.toUpperCase();
char ch;
for(int i=0;i<v.length();i++)
{
ch=v.charAt(i);
System.out.println();
if(ch=='A')
ob.A(n);
if(ch=='B')
ob.B(n);
if(ch=='C')
ob.C(n);
if(ch=='D')
ob.D(n);
if(ch=='E')
ob.E(n);
if(ch=='F')
ob.F(n);
if(ch=='G')
ob.G(n);
if(ch=='H')
ob.H(n);
if(ch=='I')
ob.I(n);
if(ch=='J')
ob.J(n);
if(ch=='K')
ob.K(n);
if(ch=='L')
ob.L(n);
if(ch=='M')
ob.M(n);
if(ch=='N')
ob.N(n);
if(ch=='O')
ob.O(n);
if(ch=='P')
ob.P(n);
if(ch=='Q')
ob.Q(n);
if(ch=='R')
ob.R(n);
if(ch=='S')
ob.S(n);
if(ch=='T')
ob.T(n);
if(ch=='U')
ob.U(n);
if(ch=='V')
ob.V(n);
if(ch=='W')
ob.W(n);
if(ch=='X')
ob.X(n);
if(ch=='Y')
ob.Y(n);
if(ch=='Z')
ob.Z(n);
}
}
}
}
