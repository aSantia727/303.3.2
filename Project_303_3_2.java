import java.util.Scanner;

public class Project_303_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadingStringFromConsole.main(args);
		ReadingStringFromConsole2.main(args);
	}

}

class ReadingStringFromConsole {
	   public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter three words separated by spaces: ");
	       String s1 = input.next();
	       String s2 = input.next();
	       String s3 = input.next();
	       System.out.println("s1 is " + s1);
	       System.out.println("s2 is " + s2);
	       System.out.println("s3 is " + s3);
	   }
	}

class ReadingStringFromConsole2 {
	   public static void main(String[] args) {

	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter a character: ");
	       String s = input.nextLine();
	       char ch = s.charAt(0);
	       System.out.println("The character entered is " + ch);
	   }
	}

