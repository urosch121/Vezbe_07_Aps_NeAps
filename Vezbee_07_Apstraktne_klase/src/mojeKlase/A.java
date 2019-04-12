package mojeKlase;

public abstract class A 
{
	private int t1;
	
	public A()
	{
		t1 = 10;
	}

	public abstract void Aps1(); 
	public abstract void Aps2();   // nema definiciju ( implementaciju )
	public abstract void Aps3();
	
	public void NeAps1() 
	{
		System.out.println("A:NeAps1");
	}
	
	public int GetT1() 
	{
		return t1;
	}
	public static void Staticka1()
	{
		System.out.println("A: Staticka1");
	}
	
}
