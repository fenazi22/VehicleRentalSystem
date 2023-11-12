public class Truck implements Vehicle{
    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    private String type ;private int week;private final double rate = 500;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return week*rate;
    }

    @Override
    public void displayDetails() {
        System.out.println("\tTruck Type:"+type +"\n"+
                "\tDaily Rental Rate: $  "+rate+"\n" +
                "\tRental Cost: $"+calculateRentalCost()+"\n");
    }

}
