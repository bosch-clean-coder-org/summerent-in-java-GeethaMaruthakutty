package TypewiseAlert;

public class ControllerAlert implements AlertAction{

	@Override
	public void send(String msg) {
		 int header = 0xfeed;
	     System.out.printf("%d : %s\n", header, msg);
		
	}

}
