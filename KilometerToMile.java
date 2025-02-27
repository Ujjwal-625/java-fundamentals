import java.util.*;

class KilometerToMile{
        public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        double a;
        System.out.println("Enter the distance in kilometer ");
        a=sc.nextDouble();
        double ans=0.621371*a;
        System.out.println(a + " km = " +ans+" miles");
}
}
