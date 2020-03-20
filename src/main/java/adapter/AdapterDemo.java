package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        PharmacyForPeople pharmacyForPeople = new PharmacyForPeople();

        pharmacyForPeople.serves(" blue and white facial masks, ", " protective clothes ",
                "and analogue thermometers ");
    }
}
