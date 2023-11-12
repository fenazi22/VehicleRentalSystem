import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Vehicle>  rentedVehicles = new ArrayList<>();

            Vehicle c = new Car(1, "t");
        c.displayDetails();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\t---Vehicle Rental System---\n" +
                    "1. Rent a Car  \n" +
                    "2. Rent a Bike  \n" +
                    "3. Rent a Truck  \n" +
                    "4. View Rented Vehicles  \n" +
                    "5. Exit  ");

            System.out.print("\n\tEnter your choice: ");

            char choice = input.next().charAt(0);

            switch (choice) {

                case '1':
                    System.out.print("Enter Car Model: ");
                    String model = input.next();

                    System.out.print("Enter Rental Days: ");
                    int days = input.nextInt();
                    Vehicle car = new Car(days, model);
                    car.displayDetails();
                    rentedVehicles.add(car);


                    break;

                case '2':

                    System.out.print("Enter bike brand: ");
                    String brand = input.next();
                    System.out.print("Enter Rental hours: ");
                    int hours = input.nextInt();
                    Vehicle bikes = new Bike(brand,hours );
                    bikes.displayDetails();
                    rentedVehicles.add(bikes);

                    break;

                case '3':
                    System.out.print("Enter truck type: ");
                    String type = input.next();
                    System.out.print("Enter Rental week: ");
                    int week = input.nextInt();
                    Vehicle trucks=new Truck(type,week);
                    trucks.displayDetails();
                    rentedVehicles.add(trucks);

                    break;

                case '4':
                    for (Vehicle display:rentedVehicles) {
                        display.displayDetails();
                    }

                    break;

                case '5':
                    System.out.println("\tThank you ");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Your Input Wrong!");
            }
        }
    }


    static void VehicleRentalSystem(){
    }

}