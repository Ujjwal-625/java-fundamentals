import java.util.*;

class SimpleInterest{ 

public static void main(String [] args){

	Scanner sc=new Scanner(System.in);
	int p,r,t;
	System.out.println("Enter the prinicple amount");
	p=sc.nextInt();
	System.out.println("Enter the rate of interest");
	r=sc.nextInt();
	System.out.println("Enter the time for which money is borrowed");
	t=sc.nextInt();
	double amount=(p*r*t)/100;
	System.out.println("Your simple interest will be "+amount);
	System.out.println("Your total payble amount will be " + (p+amount) ); 
}

}
