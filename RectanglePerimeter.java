import java.util.*;

class RectanglePerimeter{
	public static void main(String [] args){
	Scanner sc =new Scanner(System.in);
	float l,b;
	System.out.println("Enter the length of rectangle ");
	l=sc.nextFloat();
	System.out.println("Enter the breadth of rectangle ");
	b=sc.nextFloat();
	double ans=2*(l+b);
	System.out.println("the perimeter of the recatangle is " +ans);
}
}
