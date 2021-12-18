interface Bank{
	public abstract void openAccount();
	public abstract void closeAccount();
	
}
 class SBI implements Bank{

	@Override
	public void openAccount() {
		System.out.println("opening your account....");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		System.out.println("closing your account....");
		
	}
	
}
public class bankSBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		sbi.openAccount();
		sbi.closeAccount();

	}

}
