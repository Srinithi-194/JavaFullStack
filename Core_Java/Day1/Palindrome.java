import java.util.Scanner;
public class Palindrome
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int rem=0,num=n,sum=0;
while(n>0)
{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;
}
if(sum==num)
{
System.out.println("Given number is palindrome");
}
else
{
System.out.println("Given number is not palindrome");
}
}
}