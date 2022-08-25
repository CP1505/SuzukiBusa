package Casting;

public class CastingMainEx1 {
public static void main(String[] args) {
	//calling Parent class
	CastingParentEx1 z=new CastingParentEx1();
	z.RBI();
	z.Axix();
	z.HDFC();
	z.ICICI();
	System.out.println("======================================");
	
	//Calling Child class 
	CastingChildEx1 x=new CastingChildEx1();
	x.SBI();
	x.ICICI();
	x.Axix();
	x.RBI();
	x.HDFC();
	
	System.out.println("======================================");
	
	//UP casting
	
	CastingParentEx1 c=new CastingChildEx1();
	c.Axix();
	c.HDFC();
	c.ICICI();
	c.RBI();
	
	System.out.println("======================================");
	
	//Down Casting
	
	CastingChildEx1 v=(CastingChildEx1) new CastingParentEx1();
	v.Axix();
	v.HDFC();
	v.ICICI();
	v.RBI();
	v.SBI();
	
	
	
	
	
	
	
}
}
