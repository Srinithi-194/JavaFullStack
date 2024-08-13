package com.sri;

class Aa
{
	Aa()
	{
		System.out.println("A");
	}
	Aa(int a)
	{
		System.out.println("A 1");
	}
}
class Ba extends Aa
{
	Ba()
	{
		super(18);
		System.out.println("B");
	}

}
public class Super2 {
  public static void main(String args[])
  {
	  Ba b=new Ba();
  }
}