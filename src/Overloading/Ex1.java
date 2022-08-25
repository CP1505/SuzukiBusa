package Overloading;

public class Ex1 {
	
	public void Test() {
		System.out.println("Sample Non Static method");
	}
	public static void Test(int a) {
		System.out.println("Sample Static method=="+a);
	}
//	public void Test(int a,int b) {
//		System.out.println(a+b);
//	}
    public void Test(int a,int b,int c) {
    	System.out.println(a+b+c);
    }
    public void Test(int c,double d) {
    	System.out.println(c-d);
    }
    public void Test(double a,int b) {
    	System.out.println(a+b);
    }
    public void Test(String s) {
    	System.out.println(s);
    }
    public int Test(int a,int b) {
    	return a+b;
    }
    
    public static void main(String[] args) {
		
    	Ex1.Test(10);
    	Ex1 z=new Ex1();
    	z.Test();
    	z.Test("main");
    	z.Test(20.2, 10);
    	z.Test(10, 10.5);
    	z.Test(10, 300);
    	z.Test(1, 20, 60);
    	//z.Test(1, 20);
    	System.out.println(z.Test(1, 20));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
