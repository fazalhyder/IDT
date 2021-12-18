//single inheritence
class car1{
	public void move() {
		System.out.println("moving");
		
	}
	public void brake() {
		System.out.println("brakeing");
		
	}
}
class audi extends car1{
	public void autopilot() {
		System.out.println("auto pilot mode on ");
	}
	public void autogear() {
		System.out.println("automatic transmission enabled");
	}
	
}
// end of single inheritence
// multi level inheritence
class TV{
	public void sound() {
		System.out.println("sound check !");
		
	}
	public void picture() {
		System.out.println("picture check !");
	}
}
class ThreeDTV extends TV{
	public void threeD() {
		System.out.println("3D check !");
		
	}
	public void dolbyAudio() {
		System.out.println("dolby audio check !");
		
	}
}
class smartTV extends ThreeDTV{
	public void internet() {
		System.out.println("internet check !");
	}
	public void fullHD() {
		System.out.println("high definition check !");
	}
}

//Hierarchical inheritence
class employee{
	public void getEmployeeName() {
		System.out.println("mallesh");
	}
	public void getEmployeeID() {
		System.out.println("21212212");
	}
}
class permanentEmployee extends employee{
	public void salaryOnMonthly() {
		System.out.println("monthly salary for permanent emp is $5000");
	}
}
class contractEmployee extends employee{
	public void salaryOnHourly() {
		System.out.println("hourly salary is $40");
	}
}
public class inheritence {

	public static void main(String[] args) {
		audi a = new audi();
		a.autogear();
		a.autopilot();
		a.brake();
		a.move();
		
		smartTV stv = new smartTV();
		stv.dolbyAudio();
		stv.fullHD();
		stv.internet();
		stv.picture();
		stv.threeD();
		stv.sound();
		
		contractEmployee e =new contractEmployee();
		e.getEmployeeID();
		e.getEmployeeName();
		e.salaryOnHourly();
		
		permanentEmployee pe = new permanentEmployee();
		pe.salaryOnMonthly();
		pe.getEmployeeID();
		pe.getEmployeeName();

	}

}
