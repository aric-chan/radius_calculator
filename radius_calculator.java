import java.util.Scanner;
import java.text.DecimalFormat;
public class radius_calculator
{
    public static void main(String[] args) {
        //creates four primitive variables
        double rad,cir,vol,sur;
        //create a new object of Scanner class
        Scanner scan = new Scanner(System.in);
        //prompt user to input radius
        System.out.print ("Enter sphere’s radius : ");
        rad = scan.nextDouble();
        //construct the formula
        cir = 2*Math.PI*rad;
        //Need to cast value into double, or Java will perform integer division
        vol = ((double)4/3)*Math.PI*Math.pow(rad,3);
        sur = 4*Math.PI*Math.pow(rad,2);
        //create a new object of Decimalformat class
        DecimalFormat fmt = new DecimalFormat("0.####");
        
        System.out.println ("circumference : " + fmt.format(cir));
        System.out.println ("volume  : " + fmt.format(vol));
        System.out.println ("surface area : " + fmt.format(sur));
        System.out.println("Second Commit");
    }
}