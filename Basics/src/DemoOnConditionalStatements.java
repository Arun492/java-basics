import java.io.*;
class DemoOnConditionalStatements
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE \"AGE\"");
		int age=Integer.parseInt(br.readLine());
		if(age>=18)
		         System.out.println("YOU ARE \"ELIGIBLE\" FOR VOTE");
		else
		         System.out.println("YOU ARE \"NOT ELIGIBLE\" FOR VOTE");		
	}
}