package first;

public class Bus {
	private String seats;
	private String people;
	private String driver;
	public void MyBus()
	{
		System.out.println("the bus is ready");
	}
public static void main(String[] arg) {
	System.out.println("this is my bus");
	Bus objectreference=new Bus();
	objectreference.MyBus();
}
}
