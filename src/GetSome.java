import java.util.Scanner;

public class GetSome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 1;
		System.out.println("Skriv in ett par nummer s� kommer jag l�gga ihop dom");
		int number = 0;

		while (a != 0) {
			a = sc.nextInt();
			number += a;
			System.out.println("Ditt totala v�rde �r nu uppe i " + number);

			if (a == 0) {
				System.out.println("Ditt totala v�rde var " + number);

			}
		}
		sc.close();
	}

}
