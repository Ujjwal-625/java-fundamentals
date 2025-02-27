import java.util.*;

class PowerCalculation{
        public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int b,e;
        System.out.println("Enter the base ");
        b=sc.nextInt();
        System.out.println("Enter the exponent ");
        e=sc.nextInt();
        double ans=Math.pow(b,e);
        System.out.println(ans);
}
}
