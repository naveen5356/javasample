package first;
public class ClassRoom {
	private String board;
	private String duster;
	private String fans;
	public void myRoom()
	{
		System.out.println("classroom consists of");
		System.out.println("benchs");
		System.out.println("students");
		System.out.println("books");
	}
	public void bench() 
	{
		System.out.println("hard wood");
		System.out.println("steel");
		System.out.println("racks");
	}
	public void book() 
	{
		System.out.println("papers");
		System.out.println("pages");
	}
	
public static void main(String[] arg) {
	System.out.println("this is classroom");
	ClassRoom objectreference=new ClassRoom();
	objectreference.myRoom();
	objectreference.bench();
	objectreference.book();
}
}
