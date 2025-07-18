package JAVATASKS;

class Vehicle {
    String make;
    String model;
    int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}


public class Task13 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Vios", 2014, 4);
        Car myCar2 = new Car("Honda", "Civic", 1999, 4);
        Car myCar3 = new Car("Isuzu", "Mu-X", 2022, 4);
        myCar.displayDetails();
        System.out.println();
        myCar2.displayDetails();
        System.out.println();
        myCar3.displayDetails();
    }
}
