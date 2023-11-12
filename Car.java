public class Car implements Vehicle{
private int   days;
private final double  rate=50;
private String model ;

    public Car(int days, String model) {
        this.days = days;
        this.model = model;
    }

    public double getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculateRentalCost() {
        return days*rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\tCar Model:   "+model+"\n" +
                "\tDaily Rental Rate: $" +rate+"\n"+
                "\tRental Cost: $"+calculateRentalCost()+"\n");
    }
}
