import java.util.Scanner;

public class globalwarmtest {
	
		
	static void soru1() {
		System.out.println("Hangi �lke en �ok sera gaz� yaymaktad�r");
		System.out.println("1: �in");
		System.out.println("2: Hindistan");
		System.out.println("3: Amerika");
		System.out.println("4: Japonya");
	}
		static void soru2() {
		System.out.println("Hangi Gezegenin atmosferi k�resel �s�nma ile yok edilmektedir");
		System.out.println("1: Jupiter");
		System.out.println("2: Ven�s");
		System.out.println("3: Mars");
		System.out.println("4:Merk�r");
	}
		static void soru3() {
		System.out.println("A�a��dakilerden hangisi k�resel �s�nman�n olumsuz bir etkisi de�ildir?");
		System.out.println("1: Daha b�y�k bal�k n�fusu.");
		System.out.println("2: Yeni bula��c� hastal�klar�n ortaya ��kmas�.");
		System.out.println("3: T�rlerin yok olmas�.");
		System.out.println("4: K�y� alanlar�n�n kayb�.");
	}
		static void soru4() {
		System.out.println("Kirlilik havaya yay�ld�k�a ne azal�r?");
		System.out.println("1: Okyanuslar.");
		System.out.println("2: Ozon Tabakas�.");
		System.out.println("3: Ya�murlar.");
		System.out.println("4: Karbondioksit.");	
	}
		static void soru5() {
		System.out.println(" Bunlardan hangisi toksik bir sera gaz�d�r?");
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
			System.out.println("Do�ru");
			
		}else {
			System.out.println("Yanl��");
		}
		soru2();
		
		dizi[1]=s.nextInt();
		if(dizi[1]==2) {
			sayac++;
			System.out.println("Do�ru");
			
		}else {
			System.out.println("Yanl��");
		}
		soru3();
		dizi[2]=s.nextInt();
		if(dizi[2]==1) {
			sayac++;
			System.out.println("Do�ru");
		}else {
			System.out.println("Yanl��");
		}
		
		soru4();
		dizi[3]=s.nextInt();
		if(dizi[3]==2) {
			sayac++;
			System.out.println("Do�ru");
		}else {
			System.out.println("Yanl��");
		}
		soru5();
		dizi[4]=s.nextInt();
		if(dizi[4]==4) {
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
