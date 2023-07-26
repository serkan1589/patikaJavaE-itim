import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double tutar, kdv, kdvTutar, ürünKdv;

		System.out.print("Ürün fiyatını giriniz: ");
		tutar = input.nextDouble();

		if (tutar > 0 && tutar < 1000) {
			kdv = 0.18;

			kdvTutar = tutar * kdv;

			ürünKdv = kdvTutar + tutar;

			System.out.println("KDV'li Ürün Fiyatı: " + ürünKdv);

		} else if (tutar > 1000) {

			kdv = 0.8;

			kdvTutar = tutar * kdv;

			ürünKdv = kdvTutar + tutar;

			System.out.println("KDV'li Ürün Fiyatı: " + ürünKdv);

		}

	}

}
