package com.sri;

public class Employees {
	double baseSalary;
    double bonus;
    double commission;
    double overtimePay;
    double allowances;
    double deductions;
    double salary;
   Employees(double baseSalary, double bonus, double commission, double overtimePay, double allowances, double deductions) {
       this.baseSalary = baseSalary;
       this.bonus = bonus;
       this.commission = commission;
       this.overtimePay = overtimePay;
       this.allowances = allowances;
       this.deductions = deductions;
   }
   void calcSalary()
   {
   	this.salary=(this.baseSalary+this.allowances+this.bonus+this.commission+this.overtimePay)-this.deductions;
   }
   void updateSalary(double baseSalary, double bonus, double commission, double overtimePay, double allowances, double deductions)
   {
   	this.salary=(baseSalary+allowances+bonus+commission+overtimePay)-deductions;

   }
   void display()
   {
   	System.out.println("Salary: "+this.salary);
   }
	public static void main(String[] args)
	{
      Employees e=new Employees(55500,32900,2929.23,4920.29,29202.29,59002.19);
      System.out.println("Before: ");
      e.calcSalary();
      e.display();
      System.out.println("After: ");
      e.updateSalary(27289, 891.339, 82890.29, 28919.39, 29920.290, 9992.22);
      e.display();
	}
}
