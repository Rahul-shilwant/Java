interface Talk
{

	void sayHello(String name);

}

class TalkImple implements Talk
{
	public void sayHello(String name)
	{
		System.out.println("Welcome !! "+name);
	}
}

class Demo5
{
	
	static void takeAction(Talk ref)
	{
		ref.sayHello("rahul");
	}

	public static void main(String args[])
	{
		Talk t = new TalkImple();
		// t.sayHello("Rahul");
		Demo5.takeAction(t);	
	}
}