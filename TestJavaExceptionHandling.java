package ExceptionHandling;

public class TestJavaExceptionHandling {

	public static void main(String[] args) {
		javaExceptionHandling objjavaExceptionHandling =new javaExceptionHandling ();
		
		objjavaExceptionHandling.Calculation(0);
		System.out.println("*************************");
		
		objjavaExceptionHandling.calculator();
		System.out.println("*************************");
		
		objjavaExceptionHandling.ExceptionHierarchy();
		System.out.println("*************************");
		
		objjavaExceptionHandling.Divisibleproblem(2675, 0);
		System.out.println("*************************");
		
		objjavaExceptionHandling.NumberFormatException();
		System.out.println("*************************");
		
		objjavaExceptionHandling.ArrayIndexofBoundsException();
		System.out.println("*************************");
		
		objjavaExceptionHandling.StringoutOfBoundexception();
	}

}
