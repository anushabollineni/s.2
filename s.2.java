import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
  long fact=1;
for(int i=1;i<=n;++i)
{
fact*=i;
}
System.out.println(fact );
	}
}
