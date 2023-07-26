import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		int ürünFiyat,kdv,ürünKdv=0;
		
	
		System.out.println("Ürün fiyatını Giriniz: ");
		ürünFiyat=input.nextInt();
		
		if(0<ürünFiyat && ürünFiyat<=1000) 
		{
		
			kdv=18/100;
			
			ürünKdv=ürünFiyat*kdv;
			
			System.out.println("KDV'li Fiyat: "+ürünKdv);
			
			
		}else if (ürünFiyat>1000) 
		{
			kdv=8/100;
			
ürünKdv=ürünFiyat*kdv;
			
			System.out.println("KDV'li Fiyat: "+ürünKdv);

			
		}
		

	}

}
