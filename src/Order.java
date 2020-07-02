
public class Order {
	
	/* set up vars */
	String Order;
	
	public String retrieveOrder() {
		return Order;
	}
	
	public void poll() {
		Station newStation = new Station();
		newStation.Fryer();
	}
}
