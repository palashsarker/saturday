package one;

import java.util.Scanner;

public class Two {
	
	
	public static void main(String[] args) throws badweather {
		
		Scanner ss = new Scanner(System.in);
		System.out.println("enter a value =");
		int temp=ss.nextInt();
		
		if(temp>90) {
			throw new badweather("do not go outside");
			//System.out.println("badWeather");
		}else {
			System.out.println("goodWeather");
		}
		}

}
class badweather extends Exception{

	public badweather(String s) {
		System.out.println(s);
	}
	
}
