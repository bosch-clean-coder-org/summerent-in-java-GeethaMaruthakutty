package TypewiseAlert;

public class TypewiseAlert 
{
	public static void main(String[] args) {
        CoolingTypeEnum coolingType = CoolingTypeEnum.MED_ACTIVE_COOLING;
        double temperature = 45.0;
        AlertTargetEnum alertTarget=AlertTargetEnum.TO_CONTROLLER;
        TypewiseAlert typewiseAlert= new TypewiseAlert();
        typewiseAlert.inferBreach(temperature, coolingType, alertTarget);
        
        
    }
	public BreachTypeEnum inferBreach(double temperature,CoolingTypeEnum coolingType,AlertTargetEnum alertTarget) {
		AlertAction Iaction=null;
		CheckAndAlert cooling=new CheckAndAlert(coolingType.getLowerLimit(), coolingType.getUpperLimit());
        if(alertTarget.equals(AlertTargetEnum.TO_CONTROLLER))
        	Iaction = new ControllerAlert();
        else if(alertTarget.equals(AlertTargetEnum.TO_EMAIL))
        	Iaction = new MailAlert();	
        BreachTypeEnum breachType=cooling.classifyAndAlert(temperature,Iaction);
		return breachType;
	}
}
