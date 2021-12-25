/*
1. The body mass index (BMI) is the ratio of the weight of a person (in kilograms) to the
square of the height (in meters). Write a program that takes two inputs, weight and
height, computes the BMI, and prints the corresponding BMI category:
Starvation: less than 15
Anorexic: less than 17.5
Underweight: less than 18.5
Ideal: greater than or equal to 18.5 but less than 25
Overweight: greater than or equal to 25 but less than 30
Obese: greater than or equal to 30 but less than 40
Morbidly Obese: greater than or equal to 40
Generate output as shown:
Enter weight in kilograms: 60
Enter height in meters: 1.75
Ideal
*/

import java.util.Scanner;
public class bodyType {
    
    static void display_type(double BMI){
        if(BMI < 15) System.out.println("Starvation");
        else if (BMI < 17.5) System.out.println("Anorexic");
            else if (BMI < 18.5) System.out.println("Underweight");
                else if (BMI < 25) System.out.println("Ideal");
                    else if (BMI < 30) System.out.println("Overweight");
                        else if (BMI < 40) System.out.println("Obese");
                            else System.out.println("Morbidly Obese");
    }

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in meters: ");
        double height = input.nextDouble();

        double BMI = weight/ (height * height);
        display_type(BMI);
        
    }
}
