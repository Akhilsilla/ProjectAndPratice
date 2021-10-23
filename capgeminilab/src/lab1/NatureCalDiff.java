package lab1;

public class NatureCalDiff {

	public static void main(String[] args) {
		
			calculateDifference(3);
		}
		static int calculateDifference(int n)
		{
			int sum=0,a=0,b=0;
			for(int i=1;i<=n;i++)
			{
				System.out.println("i  "+i);
				a+=i*i;
				System.out.println("a  "+a);
				b+=i;
			
			}
			System.out.println("a  "+a);
			System.out.println("b "+b);
			sum=b^2-a;
			System.out.println("sum:"+sum);
			return sum;

	}

}
