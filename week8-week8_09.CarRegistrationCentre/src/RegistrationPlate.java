
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {

        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.country != compared.country) {
            return false;
        }

        if (this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        if (this.regCode == null || this.country == null) {
            return 0;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }

}
