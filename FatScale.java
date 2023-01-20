import java.util.Scanner;

public class FatScale {
	private static String FatScale() {
		Scanner in = new Scanner(System.in);
		String Response = in.nextLine();
		if (Response.toLowerCase() == "Yes") {
			return "Fat";
		} else {
			return "Fat";
		}
	}
	public static void main(String[] args) {
		System.out.println("Is your mom fat?");
		String Fattness = FatScale();
		System.out.println("Your mom is: "+Fattness);
	}
}
