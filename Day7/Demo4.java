class Outer
{

	void m1()
	{
		class A
		{
			void m2()
			{
				System.out.println("local class");
			}

			void m3()
			{
				System.out.println("local class 2");
			}

		}

		A r = new A();
		r.m2();	
		
	}
}
class Demo4{
	public static void main(String args[]){
		Outer o = new Outer();
		o.m1();
		
	}
}