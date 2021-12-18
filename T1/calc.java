
interface calculator{
	public abstract int add(int x , int y);
	public abstract int sub(int x , int y);
	public abstract int mul(int x , int y);
	public abstract int div(int x , int y);
	
}
class methods implements calculator{

	public int add(int x , int y) {
		System.out.println(x+y);
		
		// TODO Auto-generated method stub
		return x+y;
		
	}

	public int sub(int x , int y) {
		System.out.println(x-y);
		return x-y;
		// TODO Auto-generated method stub
		
	}


	public int mul(int x , int y) {
		System.out.println(x*y);
		return x*y;
		// TODO Auto-generated method stub
		
	}

	public int div(int x , int y) {
		System.out.println(x/y);
		return x/y;
		// TODO Auto-generated method stub
		
	}
}
public class calc{
	public static void main (String args []) {
     methods m =new methods();
     m.add(2,3);
     m.div(3, 4);
     m.mul(2, 0);
     m.sub(3, 0);

	System.out.println("interface implemented!");
		
	}
}