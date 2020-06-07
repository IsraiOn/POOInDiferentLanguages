class Main {
    public static void main(final String[] args) {
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan ubervan = new UberVan("FGH569", new Account("Andres Herrera", "AND123"));
        ubervan.setPassenger(6);
        ubervan.printDataCar();
    }
}