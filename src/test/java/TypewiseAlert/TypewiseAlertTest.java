package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TypewiseAlertTest 
{
	TypewiseAlert TypewiseAlert=null;
	@Before
	public void setup()
	{
		TypewiseAlert=new TypewiseAlert();
	}
    @Test
    public void infersHighBreachAsPerLimits()
    {
//      assertTrue(TypewiseAlert.inferBreach(12, 20, 30) ==
//        TypewiseAlert.BreachType.TOO_LOW);	
    	assertTrue(TypewiseAlert.inferBreach(38.0, CoolingTypeEnum.PASSIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) == BreachTypeEnum.TOO_HIGH);
    	assertTrue(TypewiseAlert.inferBreach(48.0, CoolingTypeEnum.HI_ACTIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) ==  BreachTypeEnum.TOO_HIGH);
    	assertTrue(TypewiseAlert.inferBreach(45.0, CoolingTypeEnum.MED_ACTIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) ==  BreachTypeEnum.TOO_HIGH);
   	
    }
    @Test
    public void infersNormalBreachAsPerLimits(){
    	assertTrue(TypewiseAlert.inferBreach(32, CoolingTypeEnum.PASSIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) ==  BreachTypeEnum.NORMAL);
    	assertTrue(TypewiseAlert.inferBreach(43, CoolingTypeEnum.HI_ACTIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) ==  BreachTypeEnum.NORMAL);
    	assertTrue(TypewiseAlert.inferBreach(38, CoolingTypeEnum.MED_ACTIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) ==  BreachTypeEnum.NORMAL);
    }
    @Test
    public void infersLowBreachAsPerLimits(){
    	assertTrue(TypewiseAlert.inferBreach(-1, CoolingTypeEnum.PASSIVE_COOLING,AlertTargetEnum.TO_EMAIL) ==  BreachTypeEnum.TOO_LOW);
    	assertTrue(TypewiseAlert.inferBreach(-32, CoolingTypeEnum.HI_ACTIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) ==  BreachTypeEnum.TOO_LOW);
    	assertTrue(TypewiseAlert.inferBreach(-24, CoolingTypeEnum.MED_ACTIVE_COOLING,AlertTargetEnum.TO_CONTROLLER) ==  BreachTypeEnum.TOO_LOW);
    }
    
}
