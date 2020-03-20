package adapter;

public class PharmacyAdapter implements OrdinaryPharmacyCompany {
    SpecialPharmacyCompany specialPharmacyCompany;

    public void serves(String ordinaryFacialMasks, String ordinaryProtectiveClothes, String analogueThermometers) {
        if (ordinaryFacialMasks.equalsIgnoreCase("white and blue facial masks") ) {
            specialPharmacyCompany = new PharmacyForDoctors();
        }else if (ordinaryProtectiveClothes.equalsIgnoreCase("protective clothes")){
        }
    }
}
