package abstractfactory;

abstract class FacialMasks implements MedicineCompany {
    private FacialMasks facialMasks;

    public String maskModelName;
    public double maskPrice;
    public int maskQuantity;

    public FacialMasks createWhiteMasks () {
        this.maskModelName = maskModelName;
        this.maskPrice = maskPrice;
        this.maskQuantity = maskQuantity;
        System.out.println("here are your masks"+facialMasks);
        return this.facialMasks;
    }
}
