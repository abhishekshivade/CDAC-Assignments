class VehicleImplementation {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.displayDetails();

        v.setDetails();
        v.displayDetails();

        v.setDetails("Hummer", 3500000);
        v.displayDetails();

        v.setDetails("Cruiz", 1600000, "Sedan");
        v.displayDetails();
    }
}
