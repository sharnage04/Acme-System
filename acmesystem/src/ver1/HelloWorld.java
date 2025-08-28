package ver1;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello from Eclipse");
		System.out.println("Dave is working locally on his branch");
	
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        whatFor(userInput);

        scanner.close();
	}
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	public static void whatFor(String stringArg) {
        System.out.println(stringArg + ", what for?");
    }
}
