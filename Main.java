package JavaTypes;

public class Main {
	static int method;
	static String className;
	static Integer a = 1;
	static Integer b = 7;
	static Integer c;
	static Integer x = 10;
	static Integer y = 11;
	static Integer z = 12;

	public static void main(String[] args) {
		
		int i = 1;
		int k = 0;
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(k);
		System.out.println("Hello World");
		System.out.println("method:" + method);
		System.out.println("Class Name: + className");
		
		
		c = a + b;
		System.out.printf("%d + %d = %d\n", a,b,c);
		
		//System.out.printf(format, args)
		
		 x = y = 13;
		    z = 15;
		    System.out.printf("x = %d\n", x);
		    System.out.printf("y = %d\n", y);
		    

		    String firstName = "Tom";
		    String middle = new String("Ryan");
		    String lastName;
		    lastName = "Ryan";
		    System.out.printf("%s %s %s\n", firstName, middle, lastName);
		
		    String fullName;
		    fullName = firstName.concat(" ").concat(middle) + " " + lastName;
		    System.out.printf("full name is: %s\n", fullName);

	}

}
