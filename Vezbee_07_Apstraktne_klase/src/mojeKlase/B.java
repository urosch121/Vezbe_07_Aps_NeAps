package mojeKlase;

public abstract class B extends A
{
	@Override
	public void Aps1() 
	{
		System.out.println("B:Aps1");
	}
	
	@Override
	public void Aps3() 
	{
		System.out.println("B:Aps3");
	}
	
	public int GetValue()
	{
		Aps1();
		Aps3();
		return 100;
	}

}
