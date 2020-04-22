import java.io.*;
public class  AdditionOfTwoNumbers
{

	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Numbers:");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=a+b;
		System.out.println("Result is "+c);


	} 

}
