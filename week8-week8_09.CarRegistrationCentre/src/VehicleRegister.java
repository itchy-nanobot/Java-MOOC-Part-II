import java.util.HashMap;
import java.util.ArrayList;

/**
 * @author pranav
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        }

        return false;
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }

        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate i : this.owners.keySet()) {
            System.out.println(i);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<String>();

        for (RegistrationPlate i : this.owners.keySet()) {
            if(!ownerList.contains(this.owners.get(i))) {
                ownerList.add(this.owners.get(i));
            }
        }

        for (String k : ownerList) {
            System.out.println(k);
        }
    }

}
