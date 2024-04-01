package github;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

public class ornekler {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		///// ARASINDAKİ FARK /////
		/*
		 * == operatörü, nesnelerin bellek adreslerini karşılaştırır. Yani, iki nesnenin
		 * aynı bellek adresine sahip olup olmadığını kontrol eder. .............
		 * equals() metodu, nesnelerin içeriklerini (değerlerini) karşılaştırır. Yani,
		 * iki nesnenin içeriklerinin aynı olup olmadığını kontrol eder.
		 */

		// float veya double türleri karışılaştırırken == bu kullanılır ve bazen küçücük
		// bir farkları olabilir dikkate alınmayacak bir şekilde küçük.

		// farkları öğrenmek için böyle bir yöntem kullanılır.
		final float TOLERANCE = 0.000001f;
		float f1 = 0.1f + 0.2f;
		float f2 = 0.3f;
		if (Math.abs(f1 - f2) < TOLERANCE)
			System.out.println("Essentially equal");

		/*
		 * Java karakter verisi Unicode karakter kümesine dayanır. Unicode, her karakter
		 * için belirli bir sayısal değer belirler ve bu nedenle bir sıralama sağlar. Bu
		 * sıralamaya dayanarak karakter verileri üzerinde ilişkisel operatörler
		 * kullanabiliriz. Örneğin, '+' karakteri 'J' karakterinden daha küçüktür çünkü
		 * Unicode karakter kümesinde öncesindedir.
		 */

		/*
		 * characters unicode value 0-9 48 through 57 A-Z 65 through 90 a-z 97 through
		 * 122
		 */

		// equals kullanımı

		String name1 = "Yasir";
		String name2 = "Alrawi";

		if (name1.equals(name2))
			System.out.println("eşittir");

		/*
		 * Dizeleri karşılaştırmak için ilişkisel operatörleri kullanamayız. • String
		 * sınıfı, bir dizenin başka bir dizeden önce gelip gelmediğini belirlemek için
		 * compareTo yöntemini içerir. • name1.compareTo(name2) çağrısı:
		 * 
		 * name1 ve name2 aynı ise (aynı karakterleri içeriyorsa) sıfır döndürür. name1,
		 * name2'den küçükse negatif bir değer döndürür. name1, name2'den büyükse
		 * pozitif bir değer döndürür.
		 */

		int result = name1.compareTo(name2);

		if (result < 0)
			System.out.println(name1 + " comes first");

		else if (result == 0)
			System.out.println("Same name");

		else
			System.out.println(name2 + " comes first");

		// Yasir ve Alrawi karşılaştırırken Y ve A karşılaştırır unicode daha küçük
		// olanı alır, eğer eşit ise bir sonraki harfe bakar
		// eğer name2 = Zlrawi yaparsak Yasir döndürecek çünkü Y, Z'den daha küçüktür

		/*
		 * Leksikografik Sıralama Leksikografik sıralama, büyük harflerle ve küçük
		 * harflerle karışık olduğunda kesinlikle alfabetik değildir. Örneğin, "Great"
		 * dizesi, "fantastic" dizesinden önce gelir çünkü büyük harfler Unicode'de
		 * küçük harflerden önce gelir. Ayrıca, aynı öneki olan daha kısa dizeler, daha
		 * uzun dizelerden önce gelir (leksikografik olarak). Bu nedenle "book",
		 * "bookcase"den önce gelir.
		 */

		/*
		 * • == operatörü nesnelere uygulanabilir - iki referans birbirinin takma adıysa
		 * true döner. • equals metodu tüm nesneler için tanımlanmıştır, ancak bir sınıf
		 * yazarken yeniden tanımlamadığımız sürece, == operatörü ile aynı semantiğe
		 * sahiptir. • String sınıfında karakterleri karşılaştırmak için equals metodu
		 * yeniden tanımlanmıştır. • Bir sınıf yazarken, uygun olan herhangi bir koşul
		 * altında true döndürmek için equals metodunu yeniden tanımlayabilirsiniz.
		 */

		//////// Java'nın üç tür tekrarlama ifadesi vardır: while, do ve for döngüleri

		// C# syntaxı gibi while açabiliriz
		int count = 1;
		while (count <= 5) {
			System.out.println(count);
			count++;
		}

		// Average example
		// average();

		// WinPercentage example
		// WinPercentage();

		// denemek için
		deneme();

		//// Sonsuz Döngüler
		// Döngülerinizi normal şekilde sona ermesini sağlamak için her zaman
		//// programınızın mantığını çift kontrol etmelisiniz.

		// polindrome example from book
		// polindromeKitap();

		// benim yazdığım polindrome kodu
		// polindormeBenim();

		// hocanın yazdığı polindome kodu
		// polindormeHoca();

		// girilen (integer tipinden)bir sayının basamaklarını toplayan metot
		// basamakToplamı();

		// çıktısını soruyor
		// output1(); // sonsuz 0 yazdırıyor
		// output2();

		// girilen bir sayının bölenlerini yazdıran metot
		// getDivisors();

		/////////// Iterator
		/*
		 * Iterator, bir koleksiyon içindeki öğeleri tek tek işlemenizi sağlayan bir
		 * nesnedir. Her öğeyi sırayla geçmenize ve gerektiğinde işlem yapmanıza olanak
		 * tanır. Iterator'ün hasNext() metodu, işlenecek en az bir öğe daha varsa true
		 * döndürür. next() metodu ise bir sonraki öğeyi döndürür. Iterator nesneleri,
		 * Java'da Iterator arabirimini kullanarak tanımlanır.
		 */

		/*
		 * Java standart sınıf kitaplığında birkaç sınıf iterator'dır. Scanner sınıfı
		 * bir iterator'dır: hasNext yöntemi, taranacak daha fazla veri varsa true
		 * döndürür. next yöntemi, bir sonraki taranan öğeyi bir dize olarak döndürür.
		 * Scanner sınıfı, belirli veri türleri için hasNext yöntemine benzer
		 * varyasyonlara da sahiptir (örneğin hasNextInt).
		 */

		/*
		 * Scanner'ın bir iterator olduğu gerçeği, bir dosyadan girdi okurken özellikle
		 * yararlıdır. Bir dosyada saklanan URL listesini okuyup işlemek istediğimizi
		 * varsayalım. Her bir URL'yi işlemek için bir tarama ayarlanabilir, dosyanın
		 * sonuna kadar her satırı okur. Diğer bir tarama, her URL için yolun her
		 * bölümünü işlemek üzere ayarlanabilir. URLDissector.java dosyasına bakın.
		 */

		// bir dosya okur ve içindeki url'ların üzerinde işlem yapar
		// URLDissector();

		// useDelimiter metodu split gibi bir metot, ancak io sınıfın metodudur
		// useDelimiterKullanımı();

		/////// ArrayList ///////

		// - Bir ArrayList nesnesi, ihtiyaç duyulduğunda büyür ve küçülür, gerektiğinde
		// kapasitesini ayarlar.
		// - java.util.ArrayList packageinde yer alır.
		// - ArrayList'in index değerleri 0'dan başlar.
		// - ekleme ve silme işlemlerine göre indexler ayarlanır.

		// arrayLinsKullanımı();

		/////// switch ///////
		// switchKullanımı();

		/////// ?: Conditional operator ///////

		// ?: operatörü (koşullu operatör veya üçlü operatör olarak da bilinir), bir
		// if-else ifadesinin kısa bir versiyonudur. Bu operatör, bir koşulu
		// değerlendirir ve sonucuna göre iki farklı ifade arasında seçim yapar. İki
		// ifade arasında bir seçim yaparken şu yapıyı takip eder

		// koşul ? ifade1 : ifade2

		// örnek:
		int x = 10;
		int y = (x > 5) ? 1 : 0; // y = 1 olacak
		// Bu kod, x'in 5'ten büyük olup olmadığını kontrol eder. Eğer büyükse, y değeri
		// 1 olur, aksi halde 0 olur.

		/////// for-each ///////

		/*
		 * for-each döngüsü (ya da foreach döngüsü), bir koleksiyondaki her öğeyi
		 * işlemek için kullanılan bir döngü türüdür. Java'da, Iterable arabirimini
		 * uygulayan bir nesne üzerinde for-each döngüsü kullanılabilir. Iterable
		 * arabirimi, bir koleksiyonun her öğesine erişmek için kullanılan bir dizi
		 * yöntemi sağlar.
		 */

		/*
		 * Bazı nesnelerin yineleyiciler olarak kabul edilir, bunlar her bir öğeyi
		 * işlemek için hasNext ve next yöntemlerine sahiptir.
		 */

		/////// Dialog boxes ///////

		/*
		 * Dialog kutuları, GUI işlemlerini desteklemekte yardımcı olabilecek bir
		 * bileşendir. Bir dialog kutusu, kullanıcının etkileşimde bulunabileceği bir
		 * grafik penceresidir. Dialog kutuları, bilgi iletmek, bir eylemi onaylamak
		 * veya kullanıcının bazı bilgileri girmesine izin vermek gibi çeşitli amaçlar
		 * için kullanılabilir. Genellikle bir dialog kutusu yalnızca belirli bir amaca
		 * hizmet eder ve kullanıcının etkileşimi kısa sürelidir.
		 */

		GUI();

	}

	public static void deneme() {

	}

	public static void GUI() {
		String numStr, result;
		int num, again;

		do {
			numStr = JOptionPane.showInputDialog("Enter an integer");
			num = Integer.parseInt(numStr);

			result = "That number is " + ((num % 2 == 0) ? "even" : "odd");

			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(null, "Do Another?");
		} while (again == JOptionPane.YES_OPTION);
	}

	public static void forEachKullanımı() {
		ArrayList<String> liste = new ArrayList<>();
		liste.add("A");
		liste.add("B");
		liste.add("C");

		// for-each döngüsü
		for (String eleman : liste) {
			System.out.println(eleman);
		}

		// for döngüsü
		for (int i = 0; i < liste.size(); i++) {
			String eleman = liste.get(i);
			System.out.println(eleman);
		}

		Iterator<String> iterator = liste.iterator();

		// hasNext() metodunu kullanarak while döngüsü
		while (iterator.hasNext()) {
			String eleman = iterator.next();
			System.out.println(eleman);
		}
	}

	public static void switchKullanımı() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Lütfen bir ay numarası girin (1-12): ");
		int month = scanner.nextInt();
		String monthString;

		switch (month) {
		case 1:
			monthString = "Ocak";
			break;
		case 2:
			monthString = "Şubat";
			break;
		case 3:
			monthString = "Mart";
			break;
		case 4:
			monthString = "Nisan";
			break;
		case 5:
			monthString = "Mayıs";
			break;
		case 6:
			monthString = "Haziran";
			break;
		case 7:
			monthString = "Temmuz";
			break;
		case 8:
			monthString = "Ağustos";
			break;
		case 9:
			monthString = "Eylül";
			break;
		case 10:
			monthString = "Ekim";
			break;
		case 11:
			monthString = "Kasım";
			break;
		case 12:
			monthString = "Aralık";
			break;
		default:
			monthString = "Geçersiz ay";
			break;
		}

		System.out.println("Girdiğiniz ay numarasına karşılık gelen ay: " + monthString);

		scanner.close();

	}

	public static void arrayLinsKullanımı() {
		// ArrayList oluşturma
		ArrayList<String> myList = new ArrayList<String>();

		// boolean add(E obj): Belirtilen öğeyi listenin sonuna ekler.
		boolean added = myList.add("Bashful");

		// void add(int index, E obj): Belirtilen konuma belirtilen öğeyi ekler.
		myList.add(1, "Sleepy");

		// Object remove(int index): Belirtilen konumda bulunan öğeyi listeden kaldırır.
		Object removed = myList.remove(0);

		// Object get(int index): Belirtilen konumdaki öğeyi döndürür.
		Object element = myList.get(0);

		// boolean isEmpty(): Liste boş mu diye kontrol eder.
		boolean empty = myList.isEmpty();

		// int size(): Listenin boyutunu döndürür.
		int size = myList.size();

	}

	public static void useDelimiterKullanımı() {
		try {
			// Okunacak dosyanın yolu
			String dosyaYolu = "dosya.txt";

			// Dosya nesnesi oluştur
			File dosya = new File(dosyaYolu);

			// Dosyadan veri okumak için Scanner nesnesi oluştur
			Scanner scanner = new Scanner(dosya);

			// Ayırıcı karakter olarak virgülü kullan
			scanner.useDelimiter(",");

			// Dosyadan veri oku ve işle
			while (scanner.hasNext()) {
				String token = scanner.next();
				// Okunan veriye yapılacak işlemler burada gerçekleştirilir
				System.out.println(token); // Örneğin, konsola yazdırabiliriz
			}

			// Kullanılan kaynakları serbest bırak
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı: " + e.getMessage());
		}
	}

	public static void URLDissector() throws IOException {
		String url;
		Scanner fileScan, urlScan;
		fileScan = new Scanner(new File("urls.inp"));
		// Read and process each line of the file
		while (fileScan.hasNext()) {
			url = fileScan.nextLine();
			System.out.println("URL: " + url);
			urlScan = new Scanner(url);
			urlScan.useDelimiter("/");
			// Print each part of the url
			while (urlScan.hasNext())
				System.out.println(" " + urlScan.next());
			System.out.println();
		}
	}

	public static void getDivisors() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the integer number: ");
		int num = scan.nextInt();

		if (num == 0) {
			System.out.println("0 Sayınını bir böleni yoktur!");
			return;
		}

		System.out.print("Divisors of " + num + ": 1 ");
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
		System.out.println(num); // çünkü kendisi de kendisine bir bölendir.
	}

	public static void output2() {
		int low = 0, high = 10, mid;

		while (low <= high) {

			mid = low;

			while (mid <= high) {
				System.out.print(mid + " ");
				mid++;
			}

			System.out.println();
			low++;

		}

	}

	public static void output1() { // sonsuz 0 yazdırıyor
		int low = 0, high = 10;

		while (low <= high) {
			System.out.println(low);
			high = high - low;
		}
	}

	public static void basamakToplamı() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayınızı giriniz: ");
		int num = scan.nextInt();

		int total = 0;

		while (num > 0) {
			total += num % 10;
			num /= 10;
		}

		System.out.println("Toplam: " + total);

	}

	public static void polindormeBenim() {
		Scanner scan = new Scanner(System.in);
		System.out.print("kontrol etmek istediğin cümleyi gir: ");
		String st = scan.nextLine();

		int length = st.length(), p = 0;
		for (int i = 0; i < length / 2; i++) {
			if (st.charAt(i) != st.charAt(length - i - 1)) {
				p = 1;
				break;
			}
		}
		System.out.println(p == 0 ? "polindrom" : "değil");
	}

	public static void polindormeHoca() {

		String word, reverse = "";

		Scanner scan = new Scanner(System.in);
		System.out.print("Kontrol etmek istediğiniz cümleyi girdiniz: ");
		word = scan.nextLine();

		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}

		System.out.println(
				word.equals(reverse) ? "Girdiğiniz Cümle Polindormedur" : "Girdiğiniz Cümle Polindorme Değildir");

	}

	public static void polindromeKitap() {

		String str, another = "y";

		int left, right;

		Scanner scan = new Scanner(System.in);

		while (another.equalsIgnoreCase("y")) {
			System.out.print("Enter a potential polindorme: ");
			str = scan.nextLine();

			left = 0;
			right = str.length() - 1;

			while (str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}

			System.out.println(
					(left < right) ? "The entered string is NOT polindormeé" : "The entered string is polindorme.");

			System.out.print("Test another polindorme (y/n): ");
			another = scan.nextLine();
		}

	}

	public static void average() {

		int sum = 0, value, count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Value: ");
		value = scan.nextInt();

		while (value != 0) {
			count++;
			sum += value;
			System.out.print("Enter The Value (0 to quit): ");
			value = scan.nextInt();
		}

		double average;
		if (count == 0)
			System.out.println("No value were entered!");
		else {
			average = (double) sum / count;

			DecimalFormat df = new DecimalFormat("0.###");
			System.out.println("The average is " + df.format(average));
		}

	}

	public static void WinPercentage() {
		final int NUM_GAMES = 12;
		int won;
		double ratio;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of games won (0 to " + NUM_GAMES + "): ");
		won = scan.nextInt();
		while (won < 0 || won > NUM_GAMES) {
			System.out.print("Invalid input. Please reenter: ");
			won = scan.nextInt();
		}
		ratio = (double) won / NUM_GAMES;
		NumberFormat fmt = NumberFormat.getPercentInstance();
		System.out.println();
		System.out.println("Winning percentage: " + fmt.format(ratio));
	}

}
