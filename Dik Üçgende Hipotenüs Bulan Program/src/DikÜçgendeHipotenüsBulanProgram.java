import java.util.Scanner;

public class DikÜçgendeHipotenüsBulanProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int hipotenüs, a, b, alan;

		System.out.print("Dik üçgenin a kenarını giriniz: ");
		a = input.nextInt();

		System.out.print("Dik üçgenin b kenarını giriniz: ");
		b = input.nextInt();

		hipotenüs = (a * a) + (b * b);

		alan = (a * b) / 2;

		System.out.println("Hipotenüs: " + hipotenüs);

		System.out.println("Üçgenin alanı: " + alan);

	}

}
