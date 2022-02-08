import java.util.*;


public class Main {
    public static void main(String[] args){
        BMI myObj = new BMI();


        String s;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        s = input.nextLine();
        myObj.setweight(Float.parseFloat(s));

        System.out.println("Enter height in inches: ");
        s = input.nextLine();
        myObj.setheight(Float.parseFloat(s));


        myObj.calculateBMI();


        input.close();
    }
}
