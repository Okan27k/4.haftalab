import java.util.Scanner;

public class globalwarmtest {
	
		
	static void soru1() {
		System.out.println("Hangi �lke en �ok sera gaz� yaymaktad�r");
		System.out.println("A: �in");
		System.out.println("B: Hindistan");
		System.out.println("C: Amerika");
		System.out.println("D: Japonya");
	}
		static void soru2() {
		System.out.println("Hangi Gezegenin atmosferi k�resel �s�nma ile yok edilmektedir");
		System.out.println("A: Jupiter");
		System.out.println("B: Ven�s");
		System.out.println("C: Mars");
		System.out.println("D:Merk�r");
	}
		static void soru3() {
		System.out.println("A�a��dakilerden hangisi k�resel �s�nman�n olumsuz bir etkisi de�ildir?");
		System.out.println("A: Daha b�y�k bal�k n�fusu.");
		System.out.println("B: Yeni bula��c� hastal�klar�n ortaya ��kmas�.");
		System.out.println("C: T�rlerin yok olmas�.");
		System.out.println("D: K�y� alanlar�n�n kayb�.");
	}
		static void soru4() {
		System.out.println("Kirlilik havaya yay�ld�k�a ne azal�r?");
		System.out.println("A: Okyanuslar.");
		System.out.println("B: Ozon Tabakas�.");
		System.out.println("C: Ya�murlar.");
		System.out.println("D: Karbondioksit.");	
	}
		static void soru5() {
		System.out.println(" Bunlardan hangisi toksik bir sera gaz�d�r?");
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
			System.out.println("Do�ru");
			
		}else {
			System.out.println("Yanl��");
		}
		soru2();
		
		dizi[1]=s.nextLine();
		if(dizi[1].equals("b")  || dizi[1].equals("B")) {
			sayac++;
			System.out.println("Do�ru");
			
		}else {
			System.out.println("Yanl��");
		}
		soru3();
		dizi[2]=s.nextLine();
		if(dizi[2].equals("a")  || dizi[2].equals("A")) {
			sayac++;
			System.out.println("Do�ru");
		}else {
			System.out.println("Yanl��");
		}
		
		soru4();
		dizi[3]=s.nextLine();
		if(dizi[3].equals("b")  || dizi[3].equals("B")) {
			sayac++;
			System.out.println("Do�ru");
		}else {
			System.out.println("Yanl��");
		}
		soru5();
		dizi[4]=s.nextLine();
		if(dizi[4].equals("d")  || dizi[1].equals("D")) {
			sayac++;
			System.out.println("Do�ru");
		}else {
			System.out.println("Yanl��");
		}
		if(sayac==5) {
			System.out.println("M�kemmelsin");
		}else if(sayac==4) {
			System.out.println("�ok �yi");
		}else {
			System.out.println("K�resel �s�nma hakkk�ndaki bilgilerinizi tazeleme zaman�.");
		}
		
		
		
		
		
		
		
	}

	
	

}
