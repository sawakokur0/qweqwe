public class Main {
    public static void main(String[] args) {
        Report report = new Report.Builder()
                .setTitle("Monthly Report")
                .setContent("Completed database integration and testing.")
                .build();
        System.out.println(report);

        Car car = new Car.Builder()
                .setBodyType("Coupe")
                .setEngine("3.0L V6 Twin Turbo")
                .setTrim("Sport")
                .build();
        System.out.println(car);
    }
}
