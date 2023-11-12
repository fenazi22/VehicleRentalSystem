public class Bike implements Vehicle{

    private String brand;private int hour;private final double rate=10;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour*rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\tBike Brand:   "+brand +"\n"+
                "\tDaily Rental Rate: $"+rate+"\n" +
                "\tRental Cost: $"+calculateRentalCost()+"\n");

    }
}
