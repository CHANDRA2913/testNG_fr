package sep11;

public class Raju {
	



		
			

			public static int add(int x,int y)
			{
				int z=x+y;
				return z;
				
			}
			public static String verify_String(String str1, String str2)
			{
				String res="";
				if(str1.equalsIgnoreCase(str2))
				{
				res="strings are equal";
				
				}
				else
				{
					res="strings are not equal";
					
				}
				return res;	
			}
			public static boolean compare_value(int a, int b)
			{
				if(a==b)
				{
					return true;	
				}
				else
				{
					return false;	
				}}
				public static void main(String[] args) {
				int z=Raju.add(200, 500);
				System.out.println(z);
				String res=Raju.verify_String("Gentle man", "Gentle man");
				System.out.println(res);

				

		}

	}


