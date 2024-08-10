import java.util.Scanner;
public class Armstrong
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int temp=n,num=n,sum=0,count=0;
while(temp>0)
{
temp=temp/10;
count++;
}
while(n>0)
{
int rem=n%10;
sum+=Math.pow(rem,count);
n=n/10;
}
if(sum==num)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not Armstrong Number");
}
}
}