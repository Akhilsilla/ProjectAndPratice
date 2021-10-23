package lab1;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkNumber(7));
		}
		public static boolean checkNumber(int n)
		{
			if(n<=0) return false;
			while(n>1)
			{
				if(n%2!=0) return false;
			
				n=n/2;
			}	
				return true;
	}

}
