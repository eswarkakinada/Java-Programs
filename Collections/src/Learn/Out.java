package Learn;

public class Out {
	int x=30;
	 class inn{
		 int x=20;
		 public void a(){
			 int x=10;
			 System.out.println(x);
			 System.out.println(this.x);
			 System.out.println(Out.this.x);
			 
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Out o =new Out();
 Out.inn i =o.new inn();
 i.a();
	}

}
