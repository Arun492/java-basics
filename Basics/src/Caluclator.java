import java.util.*;
class Calculator
{
	int a,b;
	private Scanner sc;
	int add(int a,int b)
	{
		return(a+b);
	}
	int sub(int a,int b)
	{
		return(a-b);
	}
	int mul(int a,int b)
	{
		return(a*b);
	}
	int div(int a,int b)
	{
		return(a/b);
	}
	void getData()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter a and b values.....");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public static void main(String args[])
	{
		int result,a,b;
		Calculator c=new Calculator();
		c.getData();
		a=c.a;
		b=c.b;
		result=c.add(a,b);
		System.out.println(a+"+"+b+"="+result);
		result=c.sub(a,b);
		System.out.println(a+"-"+b+"="+result);
		result=c.mul(a,b);
		System.out.println(a+"*"+b+"="+result);
		result=c.div(a,b);
		System.out.println(a+"/"+b+"="+result);
	}
}
