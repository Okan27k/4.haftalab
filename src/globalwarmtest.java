import java.util.Scanner;

public class globalwarmtest {
	
		
	static void soru1() {
		System.out.println("Hangi ülke en çok sera gazý yaymaktadýr");
		System.out.println("1: Çin");
		System.out.println("2: Hindistan");
		System.out.println("3: Amerika");
		System.out.println("4: Japonya");
	}
		static void soru2() {
		System.out.println("Hangi Gezegenin atmosferi küresel ýsýnma ile yok edilmektedir");
		System.out.println("1: Jupiter");
		System.out.println("2: Venüs");
		System.out.println("3: Mars");
		System.out.println("4:Merkür");
	}
		static void soru3() {
		System.out.println("Aþaðýdakilerden hangisi küresel ýsýnmanýn olumsuz bir etkisi deðildir?");
		System.out.println("1: Daha büyük balýk nüfusu.");
		System.out.println("2: Yeni bulaþýcý hastalýklarýn ortaya çýkmasý.");
		System.out.println("3: Türlerin yok olmasý.");
		System.out.println("4: Kýyý alanlarýnýn kaybý.");
	}
		static void soru4() {
		System.out.println("Kirlilik havaya yayýldýkça ne azalýr?");
		System.out.println("1: Okyanuslar.");
		System.out.println("2: Ozon Tabakasý.");
		System.out.println("3: Yaðmurlar.");
		System.out.println("4: Karbondioksit.");	
	}
		static void soru5() {
		System.out.println(" Bunlardan hangisi toksik bir sera gazýdýr?");
		System.out.println("1: Nitrojen.");
		System.out.println("2: Oksijen.");
		System.out.println("3: Karbonmonoksit.");
		System.out.println("4: Metan.");
	}
		
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int sayac=0;
		int[] dizi = new int[5];
		soru1();
		dizi[0]= s.nextInt();
		if(dizi[0]==1) {
			sayac++;
			System.out.println("Doðru");
			
		}else {
			System.out.println("Yanlýþ");
		}
		soru2();
		
		dizi[1]=s.nextInt();
		if(dizi[1]==2) {
			sayac++;
			System.out.println("Doðru");
			
		}else {
			System.out.println("Yanlýþ");
		}
		soru3();
		dizi[2]=s.nextInt();
		if(dizi[2]==1) {
			sayac++;
			System.out.println("Doðru");
		}else {
			System.out.println("Yanlýþ");
		}
		
		soru4();
		dizi[3]=s.nextInt();
		if(dizi[3]==2) {
			sayac++;
			System.out.println("Doðru");
		}else {
			System.out.println("Yanlýþ");
		}
		soru5();
		dizi[4]=s.nextInt();
		if(dizi[4]==4) {
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
