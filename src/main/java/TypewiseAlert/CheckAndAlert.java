package TypewiseAlert;

public class CheckAndAlert {
	String type;
	double minLimit;
	double maxLimit;
	public CheckAndAlert(double minLimit, double maxLimit) {
		this.minLimit=minLimit;
		this.maxLimit=maxLimit;
	}
	public BreachTypeEnum classifyAndAlert(double temperature, AlertAction Iaction) {
	
		if(temperature < this.minLimit) {
			//form appropriate msg and sent alert			
			Iaction.send("The Temperature is too low");
			return BreachTypeEnum.TOO_LOW;
		}
		else if(temperature > this.maxLimit) {
			//form appropriate msg and sent alert	
			Iaction.send("The Temperature is too high");
			return BreachTypeEnum.TOO_HIGH;
		}else
			return BreachTypeEnum.NORMAL;
	}
	
}
