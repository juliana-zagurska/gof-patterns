package adapter;

public class PharmacyForPeople implements OrdinaryPharmacyCompany {
    PharmacyAdapter pharmacyAdapter;

    public void serves(String ordinaryFacialMasks, String ordinaryProtectiveClothes, String analogueThermometers) {
        if (ordinaryFacialMasks.equalsIgnoreCase("blue facial masks")) {
            System.out.println("We provide blue and white facial masks for people"+ordinaryFacialMasks);
        }
        else if (ordinaryFacialMasks.equalsIgnoreCase("white facial masks")){
            pharmacyAdapter = new PharmacyAdapter();
            pharmacyAdapter.serves(ordinaryFacialMasks,ordinaryProtectiveClothes,analogueThermometers);
        }
        else {
            System.out.println("Provision" + ordinaryFacialMasks + ordinaryProtectiveClothes + analogueThermometers + "is sold out");
        }
    }
}