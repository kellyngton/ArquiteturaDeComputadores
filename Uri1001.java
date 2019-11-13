package exercicio28_10;
import java.util.Scanner;
public class Uri1001 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int A = Integer.parseInt(leitor.nextLine());
		int B = Integer.parseInt(leitor.nextLine());
		int X = A + B; 
		System.out.print("X = " + X);
		leitor.close();
	}
}
