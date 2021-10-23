package lab1;

public class CubeOfN {

	public static void main(String[] args) {
		
		cubesOfNum(23);
		
		
	}
	static void cubesOfNum(int n)
	{
		int m=0;
		int a=0;
		while(n>0)
		{
			int x=n%10;
			 m=x*x*x;
			 a=a+m;
			n=n/10;
		}
		System.out.println(a);
	}
	}


