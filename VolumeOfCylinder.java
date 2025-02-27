import java.util.*;

class VolumeOfCylinder{
	public static void main(String [] args){
		
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the height of Cylinder");
	float height=sc.nextFloat();
	System.out.println("Enter the radius of Cylinder");
	float radius= sc.nextFloat();
	double ans=Math.PI * radius *radius *height;
	System.out.println("Volume of the Cylinder with height" +height +" radius "+ r " is " + ans);

	}
}
