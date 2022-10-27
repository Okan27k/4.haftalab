import java.util.Scanner;

public class globalwarmtest {
	
		
	static void soru1() {
		System.out.println("Hangi ülke en çok sera gazý yaymaktadýr");
		System.out.println("A: Çin");
		System.out.println("B: Hindistan");
		System.out.println("C: Amerika");
		System.out.println("D: Japonya");
	}
		static void soru2() {
		System.out.println("Hangi Gezegenin atmosferi küresel ýsýnma ile yok edilmektedir");
		System.out.println("A: Jupiter");
		System.out.println("B: Venüs");
		System.out.println("C: Mars");
		System.out.println("D:Merkür");
	}
		static void soru3() {
		System.out.println("Aþaðýdakilerden hangisi küresel ýsýnmanýn olumsuz bir etkisi deðildir?");
		System.out.println("A: Daha büyük balýk nüfusu.");
		System.out.println("B: Yeni bulaþýcý hastalýklarýn ortaya çýkmasý.");
		System.out.println("C: Türlerin yok olmasý.");
		System.out.println("D: Kýyý alanlarýnýn kaybý.");
	}
		static void soru4() {
		System.out.println("Kirlilik havaya yayýldýkça ne azalýr?");
		System.out.println("A: Okyanuslar.");
		System.out.println("B: Ozon Tabakasý.");
		System.out.println("C: Yaðmurlar.");
		System.out.println("D: Karbondioksit.");	
	}
		static void soru5() {
		System.out.println(" Bunlardan hangisi toksik bir sera gazýdýr?");
		System.out.println("A: Nitrojen.");
		System.out.println("B: Oksijen.");
		System.out.println("C: Karbonmonoksit.");
		System.out.println("D: Metan.");
	}
		
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int sayac=0;
		String[] dizi = new String[5];
		soru1();
		dizi[0]= s.nextLine();
		if(dizi[0].equals("a") || dizi[0].equals("A")) {
			sayac++;
			System.out.println("Doðru");
			
		}else {
			System.out.println("Yanlýþ");
		}
		soru2();
		
		dizi[1]=s.nextLine();
		if(dizi[1].equals("b")  || dizi[1].equals("B")) {
			sayac++;
			System.out.println("Doðru");
			
		}else {
			System.out.println("Yanlýþ");
		}
		soru3();
		dizi[2]=s.nextLine();
		if(dizi[2].equals("a")  || dizi[2].equals("A")) {
			sayac++;
			System.out.println("Doðru");
		}else {
			System.out.println("Yanlýþ");
		}
		
		soru4();
		dizi[3]=s.nextLine();
		if(dizi[3].equals("b")  || dizi[3].equals("B")) {
			sayac++;
			System.out.println("Doðru");
		}else {
			System.out.println("Yanlýþ");
		}
		soru5();
		dizi[4]=s.nextLine();
		if(dizi[4].equals("d")  || dizi[1].equals("D")) {
			sayac++;
			System.out.println("Doðru");
		}else {
			System.out.println("Yanlýþ");
		}
		if(sayac==5) {
			System.out.println("Mükemmelsin");
		}else if(sayac==4) {
			System.out.println("Çok Ýyi");
		}else {
			System.out.println("Küresel ýsýnma hakkkýndaki bilgilerinizi tazeleme zamaný.");
		}
		
		
		
		
		
		
		
	}

	
	

}
