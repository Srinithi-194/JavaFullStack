import java.util.Scanner;
public class PrimeNumber
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
boolean flag=false;
if(n==1 || n==0)
{
System.out.println("Not a Prime Number");
}
else{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
flag=true;
break;
}
}
if(!flag)
{
System.out.println("Prime Number");
}
else
{
System.out.println(" Not Prime Number");
}
}
}
}