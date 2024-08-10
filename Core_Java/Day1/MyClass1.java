import java.util.Scanner;
public class MyClass1{
public static void main(String arg[]){
int employeeId;
String employeeName;
float employeeSalary;
Scanner s=new Scanner(System.in);
System.out.println("Enter employee id");
employeeId=s.nextInt();
System.out.println("Enter employee name");
employeeName=s.next();
System.out.println("Enter employee salary");
employeeSalary=s.nextFloat();
System.out.println("Enter employee id:" + employeeId);
System.out.println("Enter employee name:" + employeeName);
System.out.println("Enter employee Salary:" + employeeSalary);
}
}