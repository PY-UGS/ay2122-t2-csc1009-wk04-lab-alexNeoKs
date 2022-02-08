
public class BMI {
    private double weight;
    private double height;
    private double bmi;


    public void getweight(){
        System.out.println(weight);
    }

    public void getheight(){
        System.out.println(height);
    }

    public void setweight(double value) {
        weight = value;
        weight = weight/2.205; 
    }

    public void setheight(double value) {
        height = value;
        height = height/ 39.37;
    }

    public void calculateBMI(){
        bmi = weight/(height*height);
        System.out.format("BMI is %.2f%n",bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } 
        else if (18.5 <= bmi && bmi < 25) {
            System.out.println("Normal");
        } 
        else if(25 <= bmi && bmi < 30){
            System.out.println("Overweight");
        }
        else if(bmi>=30){
            System.out.println("Obese");
        }


    }


}