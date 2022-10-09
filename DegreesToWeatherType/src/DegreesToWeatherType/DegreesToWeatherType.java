package DegreesToWeatherType;

import java.util.Scanner;

public class DegreesToWeatherType {

    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        double temp;
        System.out.print("Enter  a temperature as a value to see the type of weather");
        temp=kb.nextDouble();
        if(temp>=80)
            System.out.println("Hot");
        else if((temp>=70)&&(temp<=79))
            System.out.println("Warm");
        else if((temp>=50)&&(temp<=69))
            System.out.println("Cool");
        else if((temp>=30)&&(temp<=49))
            System.out.println("Cold");
        else
            System.out.println("Frigid");

	/*
Enter  a temperature as a value to see the type of weather
87
Hot

Enter  a temperature as a value to see the type of weather
75.4
Warm

Enter  a temperature as a value to see the type of weather
57.8
Cool

Enter  a temperature as a value to see the type of weather46.0
Cold

Enter  a temperature as a value to see the type of weather
-2.3
Frigid

double and not integer because a decimal can be a possible output.

	 */
    }
}
