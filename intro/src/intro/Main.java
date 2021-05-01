package intro;

public class Main {
	
	public static void main(String[] args) {
		String internetSubeButonu = "İnternet Şubesine Gir";
		System.out.println("Hello Word");
		double dolarToday = 8.35;
		double dolarYesterday = 8.20;
		boolean isDecrease = false;
		
		System.out.println(internetSubeButonu);

		
		if(dolarToday < dolarYesterday) {
			System.out.println("Dolar decrease pics");
		} 
		else if (dolarToday > dolarYesterday) {
			System.out.println("Dolar increase pics");
		}
		else {
			System.out.println("Dolar equal pics");
		}
		
		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";
		String kredi7 = "Kültür Bakanlığı Kredisi";
		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		// ARRAYS
		String[] krediler = {"Hızlı Kredi","Mutlu Emekli Kredisi", "Konut Kredisi","Çiftçi Kredisi","MSB Kredisi","MEB Kredisi","Kültür Bakanlığı Kredisi"};
		
		
		// LOOPS
		// foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		// for
		for(int i =0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		// value and reference type difference
		// array, interface, class reference type
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		System.out.println(number1);
		
		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = {10,20,30,40,50};
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);
		
		String city1 ="Ankara";
		String city2 ="İstanbul";
		city1 = city2;
		city2 ="İzmir";
		System.out.println(city1);
	}
}
