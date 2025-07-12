package assignments;

public class Amazon 
{
public static void main(String[] args)
{
	int a=16742;
	int hrs=a/3600;
	a=a%3600;
	int mint=a/60;
	a=a%60;
	int second=a;
	System.out.println(hrs+" hrs "+mint+" mins "+second+" sec");
}
}