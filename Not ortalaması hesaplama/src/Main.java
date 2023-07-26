import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int matematik, fizik, kimya, turkce, tarih, muzik, ortalamaHesap;

		System.out.print("Matematik dersi notunuz : ");
		matematik = input.nextInt();

		System.out.print("Fizik dersi notunuz : ");
		fizik = input.nextInt();

		System.out.print("Kimya dersi notunuz : ");
		kimya = input.nextInt();

		System.out.print("Türkçe  dersi notunuz : ");
		turkce = input.nextInt();

		System.out.print("Tarih dersi notunuz : ");
		tarih = input.nextInt();

		System.out.print("Müzik dersi notunuz : ");
		muzik = input.nextInt();

		ortalamaHesap = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

		System.out.println("Derslerin ortalaması: "+ortalamaHesap);

	}

}
