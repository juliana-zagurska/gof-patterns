package abstractfactory;

public abstract class MedEquipment implements MedicineCompany {
    private MedEquipment MedEquipment;

    public MedEquipment createMedEquipment() {
        System.out.println("Medical equipment is available in pharmacies");
        return MedEquipment;
    }
}
