package mojeKlase;

public class E extends B 
{
	@Override
	public void Aps2() 
	{
		System.out.println("E:Aps2");
	}
	
	@Override
	public void Aps3() 
	{
		System.out.println("E:Aps3");
	}
	
	@Override
	public int GetValue() 
	{
		return super.GetValue() + 15;
	}

}
