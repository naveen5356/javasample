package first;
public class Grocery {
		private String rice;
		private String oil;
		private String nuts;
		public void MyGroceries()
		{
			System.out.println("the groceries are");
		}
	public static void main(String[] arg) {
		System.out.println("these are my grocery");
		Grocery objectreference=new Grocery();
		objectreference.MyGroceries();
	}
}
