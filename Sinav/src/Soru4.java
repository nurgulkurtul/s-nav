import java.util.Scanner;

public class Soru4 {

	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		boolean kontrol= true;
		while(kontrol) {
			System.out.println("bir seçim yapınız");
			System.out.println("1. Kare Alan Hesaplama");
			System.out.println("2. Kare Çevre Hesaplama");
			System.out.println("3. Dikdörtgen Alan Hesaplama");
			System.out.println("4. Dikdörtgen Çevre Hesaplama");
			System.out.println("5. Daire Alan Hesaplama");
			System.out.println("6. Daire Çevre Hesaplama");
			System.out.println("0. Çıkış");
			int secim=input.nextInt();
			switch(secim) {
			case 1: 
				System.out.println("Karenin uzunluğunu giriniz");
				int kareUzunluk=input.nextInt();
				int kareAlan=kareUzunluk*kareUzunluk;
				System.out.println(kareAlan);
				break;
			case 2: 
				System.out.println("Karenin uzunluğunu giriniz");
				int kareUzun=input.nextInt();
				int kareCevre=kareUzun*4;
				System.out.println(kareCevre);
				break;
			case 3: 
				System.out.println("Dikdörtgenin 1. kenar uzunluğunu giriniz");
				int dikdörtgenUzun=input.nextInt();
				System.out.println("Dikdörtgenin 2. kenar uzunluğunu giriniz");
				int dikdörtgenKisa=input.nextInt();
				int dikdörtgenAlan=dikdörtgenUzun*dikdörtgenKisa;
				System.out.println(dikdörtgenAlan);
				break;
			case 4: 
				System.out.println("Dikdörtgenin 1. kenar uzunluğunu giriniz");
				int dikdörtgenUzunK=input.nextInt();
				System.out.println("Dikdörtgenin 2. kenar uzunluğunu giriniz");
				int dikdörtgenKisaK=input.nextInt();
				int dikdörtgenCevre=(dikdörtgenUzunK+dikdörtgenKisaK)*2;
				System.out.println(dikdörtgenCevre);
				break;
			case 5: 
				System.out.println("Dairenin yarıçapını giriniz");
				int daireYaricap=input.nextInt();
				double pi=3.14;
				double daireAlan=pi*daireYaricap*daireYaricap;
				System.out.println(daireAlan);
				break;
			case 6: 
				System.out.println("Dairenin yarıçapını giriniz");
				int daireYaricap2=input.nextInt();
				double pi2=3.14;
				double daireCevre=2*pi2*daireYaricap2;
				System.out.println(daireCevre);
				break;
			case 0:
				kontrol=false;
				System.out.println("Hoşçakalın");
			}
		}
		

	
	}
}
