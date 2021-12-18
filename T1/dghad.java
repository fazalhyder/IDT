class Engine{
	int engineNumber,mftYear;
	String company;
	public Engine(int engineNumber,int mftYear,String company){
	System.out.println("constructor");
	this.engineNumber= engineNumber;
	this.mftYear=mftYear;
	this.company=company;
	System.out.println("Engine No is : " +engineNumber+ " , manufacturing year is : " +mftYear+ " ,Company name is " +company+ " .");
	}

	
	
}
class car{
	int modelNo;
	int mftYear;
	Engine engineNumber;
	public car(int modelNo,int mftYear,Engine engineNumber){
		this.modelNo=modelNo;
		this.mftYear=mftYear;
		this.engineNumber=engineNumber;
		System.out.println("model No is : " +modelNo+ " , manufacturing year is : " +mftYear+ " ,engine name is " +engineNumber+ " .");
		
	}
}
public class dghad{
public static void main(String args [])
{
	Engine E = new Engine(2222,2021,"toyota");
	Engine engineNumber = null;
	car C = new car(2022,1999,engineNumber);
	
	
}


}