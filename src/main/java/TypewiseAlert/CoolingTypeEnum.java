package TypewiseAlert;

public enum CoolingTypeEnum {
	PASSIVE_COOLING(0.0, 35.0),
    HI_ACTIVE_COOLING(0.0, 45.0),
    MED_ACTIVE_COOLING(0.0, 40.0);

    private final double lowerLimit;
    private final double upperLimit;

    CoolingTypeEnum(double lowerLimit, double upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }


    public double getLowerLimit() {
        return lowerLimit;
    }

    public double getUpperLimit() {
        return upperLimit;
    }
}
