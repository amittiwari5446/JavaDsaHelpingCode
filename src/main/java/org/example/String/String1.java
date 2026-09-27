package String;

public class String1 {
	public static void main(String[] args) {
		
		//creates mutable string, better for memory management
		StringBuilder stringBuilder= new StringBuilder();
		stringBuilder.append("Hello");
		stringBuilder.append(" ");
		stringBuilder.append("World");
		System.out.println(stringBuilder);
		
		//converts back to string
		String str = stringBuilder.toString();
		
		StringBuilder str1=new StringBuilder();
		for(int i=0;i<5;i++) str1.append(i+'a').append(" ");
		System.out.println(str1);
		str1.insert(2, " Hi");
		System.out.println(str1);
		str1.delete(3, 5);
		System.out.println(str1);
		str1.reverse();
		System.out.println(str1);
		System.out.println(str1.length());
		String str2=str1.toString();
		System.out.println(str2);
		
		
		
		
	}
}
