package lab1;
import java.util.Scanner;
public class TrafficLight {
	String red = null;
	 String yellow = null;
	 String green = null;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("select one of these three lights: RED ,YELLOW, GREEN");
		String color=scn.nextLine();
		
		switch(color)
		{
			case "red":
				System.out.println("stop");
				break;
			case "yellow":
				System.out.println("ready");
				break;
			case "green":
				System.out.println("go");
				break;
			default:
				System.out.println("input have to be traffic signal only");
				
	}

	}
}
