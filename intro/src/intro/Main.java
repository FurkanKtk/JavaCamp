package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String internetSubeButonu = "internet þubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("dolar düþtü resmi");

		}else if (dolarBugun > dolarDun) {
			System.out.println("dolar yukseldi resmi ");
			
		}else {
			System.out.println("dolar eþittir resmi");
		}
		
		String kredi1="hýzlý kredi";
		String kredi2="emekli kredi";
		String kredi3="konut kredi";
		String kredi4="çiftçi kredi";
		String kredi5="msb kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		
		
		String[] krediler= {"hýzlý kredi","emekli kredi","konut kredi",
				"çiftçi kredi","msb kredi"};
		
		//foreach
		for(String kredi:krediler) {
			System.out.println(kredi);
			
		}
		for (int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		//
		int sayi1 =10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar2[0]);
		
		
		
		
		
		
		

	}

}
