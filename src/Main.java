import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	AlphabetSoup soup = new AlphabetSoup();
	char [] alphabet = soup.getAlphabet();
	System.out.println(Arrays.toString(alphabet));

	Scanner in = new Scanner(System.in);
	System.out.println("Enter a shift amount: ");
	int shift = in.nextInt();

	char[] shiftedAlphabet = soup.shiftAlphabet(alphabet, shift);
		System.out.println(Arrays.toString(shiftedAlphabet));
    }
}
