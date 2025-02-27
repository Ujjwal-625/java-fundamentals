import java.util.*;

class Average{
        public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the first number ");
        a=sc.nextFloat();
        System.out.println("Enter the second number ");
        b=sc.nextFloat();
	System.out.println("Enter the third number  ");
	c=sc.nextFloat();
        double ans=(a+b+c)/3;
        System.out.println("the average of the three numbers is " +ans);
}
}
