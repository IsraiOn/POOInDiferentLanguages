import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberVan(final String license, final Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(final String license, final Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            super.setPassenger(passenger);
        }
        else{
            System.out.println("Se debe asignar 6 pasajeros");
        }
    }
}