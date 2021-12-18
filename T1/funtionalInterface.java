
interface FI{
	public abstract void msg(String name);
}
class MFI implements FI{
	public void msg(String name) {
		System.out.println("hello.... "+name);
	}
}
public class funtionalInterface {
	public static void main (String args []) {
		MFI mfi = new MFI();
		mfi.msg("BOSS");
		
	}

}
