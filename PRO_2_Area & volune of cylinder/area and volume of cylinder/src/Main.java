import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;

        // form input from user
        Scanner sc = new Scanner(System.in);

        // Enter radius of cylinder
        System.out.println("Enter Radius of Cylinder : ");
        double radius = sc.nextDouble();

        // Enter length of cylinder
        System.out.println("Enter Length of Cylinder : ");
        double length = sc.nextDouble();

        // Calculation
        double area = Math.pow(radius,2) * PI;
        double volume = area * length ;


        // forword two digit after decimal
        String farea = String.format("%.2f",area);
        String fvolume = String.format("%.2f",volume);

        // display the value
        System.out.println("The area is " + farea);
        System.out.println("The volume is " + fvolume);

    }
}