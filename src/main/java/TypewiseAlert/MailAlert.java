package TypewiseAlert;

public class MailAlert implements AlertAction {

	@Override
	public void send(String msg) {
		String recipient = "a.b@c.com";
		System.out.printf("To: %s\n", recipient);
		System.out.println(msg);

		
	}

}
