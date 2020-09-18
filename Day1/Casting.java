class Casting
{
	public static void main(String str[])
	{
		byte b= 12;
		int i = b ; //upcasting (byte to int) 
		System.out.println(i);
		int j = 127;
		byte b1 = (byte)j; // downcasting (int to byte) large to small
		System.out.println(b1);
	}
}