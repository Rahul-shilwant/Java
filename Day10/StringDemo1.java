

public class StringDemo1 {

	public static void main(String[] args) {
		String s = "Immutable Squence of Characters.";
		System.out.println(s);
	
		char ch1[] = s.toCharArray();
		for(int i=0 ; i<ch1.length ; i++)
		{
			System.out.println(ch1[i]);
		}
		


		String s1 = s.toUpperCase();
		System.out.println(s1);

		String s2 = s.toLowerCase();
		System.out.println(s2);
		



		int len = s.length();
		System.out.println(len);
		
		char ch = s.charAt(1);
		System.out.println(ch);
		
		int j = s.indexOf('S');
		System.out.println(j);
		
		int k = s.lastIndexOf('t');
		System.out.println(k);
		
		String s3 = s.substring(10);
		System.out.println(s3);
		
		String s4 = s.substring(10,18);
		System.out.println(s4);

	}

}
