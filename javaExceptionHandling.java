package ExceptionHandling;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

      public class javaExceptionHandling {

	  //Arithmaric Exception with try catch block
	  public void Calculation(int intdivisible) {
	 	/*int intvalue=67; 
		int  intResult=0;
		intResult=intvalue/intdivisible;
		System.out.println("Multipal Value :"+intResult);
		if (intResult>0) {
			System.out.println("I got out put");
		}*/
		try {
			int intvalue=67;
			int  intResult=0;
		    intResult=intvalue/intdivisible;
		    System.out.println("Multipal Value :"+intResult);
	       	if (intResult>0) {
			System.out.println("I got out put");
		    } 
		}	catch (Exception exception) {
			System.out.println(" I got out put :"+exception.getMessage());
			exception.printStackTrace();
		}
			System.out.println("clear Method");
		}
	   
	    //finally
	    public void calculator() {
		try {
			System.out.println("exicuted peogram");
			int Num1=67,num2=89,num3=0,Calculation;
			Calculation=Num1*num2/num3;
			System.out.println("result:"+Calculation);
		} catch (ArithmeticException arithmaticexception) {
			System.out.println("can not be exicuted");
		}
		finally {
			System.out.println(" plz Exception Handled");
		}
		System.out.println("Main Method Ended");
	    }
	
	   //Null Pointer Exception 	
	   public void ExceptionHierarchy() {
		String str=null;
		//System.out.println(str.toLowerCase());
		try {
		 System.out.println(str.toLowerCase());
			
		} catch (NullPointerException pointer ) 
		{
			System.out.println("null can not be casted");
			
		}
		}
		
	
	    //Throw keyword
	   public void  Divisibleproblem(int intNum,int intvalue) throws ArithmeticException {
			/*if(intvalue==0) {
				throw new ArithmeticException();
			}
			else {
				int result=intNum/intvalue;
				System.out.println("result");
			}*/
		
		
			try {
				throw new ArithmeticException();
			
			     } catch (Exception e) {
				System.out.println("The value of intvalue is zero");
			  }
		      }
		
	   //Number format Exception using try catch block
	   public void NumberFormatException() {
		/*String strName=2;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number :"+strName);
		strName=scan.next();
		scan.close();
		int Num=Integer.parseInt("abs");
		System.out.println("Number="+Num);*/
		try {
		int Num=Integer.parseInt("abs");
			System.out.println("Number="+Num);
		}
		catch (NumberFormatException number) {
			System.out.println("invalid format");
			
		}
	    }
	
	    //Array Index of Bound Exception
		  public void ArrayIndexofBoundsException() {
		  /*	int intage[]= {15,12,16,18,18};
			int Num;
			//try {
			System.out.println("Array Age Contains");
			for(int num=0;num<7;num++) {
				System.out.println("Age of student:"+intage[num]);
			}
		    }*/
			int intage[]= {15,12,16,18,18};
			int Num;
			try {
			System.out.println("Array Age Contains");
			for(int num=0;num<7;num++) {
				System.out.println("Age of student:"+intage[num]);
			}
		    }
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexofBoundsException");
             }
			System.out.println("End program");
	         }
		
		//String Out Of Bound Exception
		public void StringoutOfBoundexception() {
			/*String strName="Chaitali";
		      char MyName=strName.charAt(8);
			  System.out.println( MyName);*/
			try {
				String strName1="Chaitali";
				char MyName=strName1.charAt(8);
			
			}
			catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException)
			{
				System.out.println("Print Name"+stringIndexOutOfBoundsException);
			} 
		}
	
}
		
			


