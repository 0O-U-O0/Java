import javax.swing.JOptionPane;

public class display_the_code_GUI {
    public static void main(String[] args) {
        final double PI = 3.14159; // constant value of pi

        // Enter the radius
        String radiusString = JOptionPane.showInputDialog("Enter the radius of cylinder :");

        // convert string into double
        double radius = Double.parseDouble(radiusString);

        // Enter the length
        String lengthString = JOptionPane.showInputDialog("Enter the length of cylinder :");

        // convert string into double
        double length = Double.parseDouble(lengthString);

        // calculate the value
        double area = Math.pow(radius,2) * PI ;
        double volume = area * length ;

        //formate the two digit no into decimal
        area = (int)(area*100)/100.0;
        volume = (int)(volume*100)/100.0;

        // Display the message
        String output = "The Area is :"+ area +"\n The Volume is : "+volume ;
        JOptionPane.showMessageDialog(null,output);
    }
}
