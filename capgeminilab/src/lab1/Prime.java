package lab1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		int n=sc.nextInt();
		prime (n);
	}
	static void prime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i==1) continue;
			boolean flag=true;
			for(int j=2;j<=i/2;i++)
			{
				if(i%j==0)
					flag=false;
					break;
			}
			if(flag) System.out.println("the prime numbers are:"+i);
		}

	}

}
