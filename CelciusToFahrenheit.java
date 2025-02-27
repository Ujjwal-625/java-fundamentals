import java.util.*;

class CelciusToFahrenheit{
        public static void main(String [] args){
	        Scanner sc =new Scanner(System.in);
		System.out.println("Enter degree celcius");
		float a=sc.nextFloat();
        	float f=(a*9/5)+32;
        	System.out.println(a+" degree celcius are "+f+" fahrenheit");
	}
}
