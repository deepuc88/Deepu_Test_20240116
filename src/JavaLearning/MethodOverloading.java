package JavaLearning;

import java.util.Scanner;
public class MethodOverloading 
{
	static int res = 0;
	public int sum(int a, int b)
	{
		res = a + b;
		return res;
	}
	public int sum(int a, int b, int c) 
	{
		res = a + b + c;
		return res;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		obj.sum(num1,num2);
		System.out.println("First sum : "+res);
		System.out.print("Enter 3 numbers : ");
		int num3 = inp.nextInt();
		int num4 = inp.nextInt();
		int num5 = inp.nextInt();
		obj.sum(num3,num4,num5);
		System.out.print("Second sum : "+res);

	}

}
