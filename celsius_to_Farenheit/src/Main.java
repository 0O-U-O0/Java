import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // for input for console

        // Enter the celsius from user
        System.out.println("Enter the celsius eg 45 :");
        int celsius = sc.nextInt();

        //calculation
        double farenheit = ( 9.0 / 5) * celsius + 32 ; // in this case 9/5 = 1 but 9.0/5 = 1.8

        // format to keep two digit after the decimal
        farenheit = (int)(farenheit * 100)/ 100.0 ;

        // you get
        System.out.println("The value of Farenheit is : "+ farenheit);

    }
}