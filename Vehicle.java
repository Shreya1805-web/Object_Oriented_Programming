/*
2. Write a Java program that should have a class “Vehicle” with two instance variables,
no_of_seats and no_of_wheels. Create two objects, i.e., car and bike for this class and
then print their details through a display method.
Input:
Car
No of seats: 2
No of wheels: 4
Bike:
No of seats: 1
No of wheels: 2

Expected Output
Vehicles Details
Car has 4 wheels and 2 seats
Bike has 2 wheels and 2 seats
*/

import java.util.*;  
public class Vehicle{
    int no_of_seats;
    int no_of_wheels;
    String vehicle_type;
    
    public Vehicle(String vehicle ,int seats, int wheels){
        no_of_seats = seats;
        no_of_wheels = wheels;
        vehicle_type = vehicle;
    }
    
    
    void display_details(){
        
        System.out.println(vehicle_type + " has "+ no_of_wheels + " wheels and " + no_of_seats + " seats");
        
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Car: ");
        System.out.println("No of seats: ");
        int car_seats = sc.nextInt();
        System.out.println("No of wheels: ");
        int car_wheels = sc.nextInt();
        
        System.out.println("Bike: ");
        System.out.println("No of seats: ");
        int bike_seats = sc.nextInt();
        System.out.println("No of wheels: ");
        int bike_wheels = sc.nextInt();
        
        
        System.out.println("Vehicle details");
        Vehicle car= new Vehicle("Car", car_seats , car_wheels);
        Vehicle bike= new Vehicle("Bike", bike_seats , bike_wheels);
        car.display_details();
        bike.display_details();
    }
}