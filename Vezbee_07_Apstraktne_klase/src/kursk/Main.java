package kursk;

import mojeKlase.A;
import mojeKlase.B;
import mojeKlase.C;
import mojeKlase.D;
import mojeKlase.E;

public class Main {

	public static void main(String[] args) 
	{
//		A a = new A();  ne moze da se instancira objekat klase A jer je ona apstraktna
		A.Staticka1();
		
//		B b = new B();
		B.Staticka1();
		
		C c = new C();
		c.Aps1();
		c.Aps2();
		c.Aps3();
		c.Staticka1();
		
		A d = new D();
		d.Aps1();
		d.Aps2();
		d.Aps3();
		d.Staticka1(); // ne pristupa se ovako kod statitckih metoda - preko objekta, nego preko klase
		D.Staticka1();
		
		A e = new E();
		e.Aps1();
		e.Aps2();
		e.Aps3();
		E.Staticka1();
		System.out.println(e.GetT1());
	
		System.out.println(((E)e).GetValue());
		
		

	}

}
