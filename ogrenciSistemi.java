package github;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ogrenciSistemi {

	public static ArrayList<Ogrenci> ogrencileriDosyadanGetir(String yol) throws IOException {

		File dosya = new File(yol);

		if (!dosya.exists()) {
			try {
				// Dosya yoksa oluşturma
				dosya.createNewFile();
				System.out.println("Dosya yeni oluşturuldu: " + dosya.getName());
			} catch (IOException e) {
				System.out.println("Dosya oluşturulurken bir hata oluştu.");
				e.printStackTrace();
			}
		}

		Scanner scan1 = new Scanner(dosya);
		scan1.useDelimiter("\n");

		ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

		while (scan1.hasNext()) {

			String[] satir = scan1.next().split(":");
			Ogrenci ogrenci = new Ogrenci(satir[0], satir[1], Integer.valueOf(satir[2].trim()));

			ogrenciler.add(ogrenci);
		}

		return ogrenciler;
	}

	public static void ogrencileriKaydet(ArrayList<Ogrenci> ogrenciler, String yol) {

		try {
			FileWriter dosyaYazici = new FileWriter(yol);
			BufferedWriter yaz = new BufferedWriter(dosyaYazici);

			for (Ogrenci ogrenci : ogrenciler) {
				yaz.write(ogrenci.getAdSoyad() + ":" + ogrenci.getOgNo() + ":" + ogrenci.getSinif());
				yaz.newLine();
			}
			yaz.close();
		} catch (IOException e) {
			System.out.println("Dosyaya yazma hatası: " + e.getMessage());
		}
	}

	public static int islemAl() {
		Scanner scan2 = new Scanner(System.in);

		System.out.print(
				"--- İşlemler ---\nOkuma: 1\nYazma: 2\nGüncelleme: 3\nSilme: 4\nTüm Kayıtlar: 5\nçıkış: 0\nişlem: ");

		return scan2.nextInt();
	}

	public static void ogrenciOkuma(ArrayList<Ogrenci> ogrenciler) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bilgilerini okumak istediğiniz öğrencinin numarası: ");
		String ogNo = scan.nextLine();

		int index = -1;

		for (Ogrenci ogrenci : ogrenciler) {

			if (ogrenci.getOgNo().equals(ogNo)) {
				index = ogrenciler.indexOf(ogrenci);
				break;
			}
		}

		if (index == -1) {
			System.out.println("Öğrenci Bulunamadı!");
			return;
		}

		System.out.println("\nÖğrencinin Bilgileri:");
		System.out.println(ogrenciler.get(index) + "\n");
	}

	public static void ogrenciYazma(ArrayList<Ogrenci> ogrenciler) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Eklemek istediğiniz öğrencinin bilgileri\nÖğrenci Numarası: ");
		String ogNo = scan.nextLine();

		int index = -1;

		for (Ogrenci ogrenci : ogrenciler) {

			if (ogrenci.getOgNo().equals(ogNo)) {
				index = ogrenciler.indexOf(ogrenci);
				break;
			}
		}

		if (index != -1) {
			System.out.println("Öğrenci numarası sistemde mevcuttur!\n" + ogrenciler.get(index));
			return;
		}

		System.out.print("Adı Soyadı: ");
		String adSoyad = scan.nextLine();

		System.out.print("Sınıfı: ");
		int sinif = scan.nextInt();

		Ogrenci ogrenci = new Ogrenci(adSoyad, ogNo, sinif);
		ogrenciler.add(ogrenci);
		System.out.println("Öğrenci başarıyla eklenmiştir");

	}

	public static void ogrenciGuncelleme(ArrayList<Ogrenci> ogrenciler) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Güncellemek istediğiniz öğrencinin numarası: ");
		String ogNo = scan.nextLine();

		int index = -1;

		for (Ogrenci ogrenci : ogrenciler) {

			if (ogrenci.getOgNo().endsWith(ogNo)) {
				index = ogrenciler.indexOf(ogrenci);
				break;
			}
		}

		if (index == -1) {
			System.out.println("Öğrenci Bulunamadı!");
			return;
		}

		Ogrenci ogrenci = ogrenciler.get(index);

		System.out.println("\nÖğrencinin Bilgileri\n" + ogrenci + "\n");
		System.out.println("Bilgisi eskisi gibi bırakmak istediğiniz bilgiye -1 giriniz");

		System.out.print("Öğrenci Numarası: ");
		String yeniOgNo = scan.nextLine();

		if (!yeniOgNo.equals("-1")) {
			ogrenci.setOgNo(yeniOgNo);
		}

		System.out.print("Adı Soyadı: ");
		String yeniAdSoyad = scan.nextLine();

		if (!yeniAdSoyad.equals("-1")) {
			ogrenci.setAdSoyad(yeniAdSoyad);
		}

		System.out.print("Sinif: ");
		int yeniSinif = scan.nextInt();

		if (yeniSinif != -1) {
			ogrenci.setSinif(yeniSinif);
		}

		ogrenciler.set(index, ogrenci);
		System.out.println("Öğrenci Bilgileri başarıyla güncellenmiştir");

	}

	public static void ogrenciSilme(ArrayList<Ogrenci> ogrenciler) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Silmek istediğiniz öğrencinin numarası: ");
		String ogNo = scan.nextLine();

		int index = -1;

		for (Ogrenci ogrenci : ogrenciler) {

			if (ogrenci.getOgNo().equals(ogNo)) {
				index = ogrenciler.indexOf(ogrenci);
				break;
			}
		}

		if (index == -1) {
			System.out.println("Öğrenci Bulunamadı!");
			return;
		}

		ogrenciler.remove(index);
		System.out.println("Öğrenci başarıyla silinmiştir");
	}

	public static void tumKayitlar(ArrayList<Ogrenci> ogrenciler) {

		System.out.println("Sistemdeki tüm öğrencilerin bilgileri");
		for (Ogrenci ogrenci : ogrenciler) {
			System.out.println(ogrenci + "\n---------");
		}

	}

	public static void main(String[] args) throws IOException {

		final String YOL = "ogrenciler.txt";

		ArrayList<Ogrenci> ogrenciler = ogrencileriDosyadanGetir(YOL);

		int islem = islemAl();

		while (islem != 0) {
			if (islem == 1) {
				ogrenciOkuma(ogrenciler);
			} else if (islem == 2) {
				ogrenciYazma(ogrenciler);
				ogrencileriKaydet(ogrenciler, YOL);
			} else if (islem == 3) {
				ogrenciGuncelleme(ogrenciler);
				ogrencileriKaydet(ogrenciler, YOL);
			} else if (islem == 4) {
				ogrenciSilme(ogrenciler);
				ogrencileriKaydet(ogrenciler, YOL);
			} else if (islem == 5) {
				tumKayitlar(ogrenciler);
			} else {
				System.out.println("Yanlış Seçim");
			}

			islem = islemAl();
		}

	}

}

class Ogrenci {

	private String adSoyad;
	private String ogNo;
	private int sinif;

	public Ogrenci(String adSoyad, String ogNo, int sinif) {
		this.ogNo = ogNo;
		this.adSoyad = adSoyad;
		this.sinif = sinif;
	}

	public String getOgNo() {
		return ogNo;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public int getSinif() {
		return sinif;
	}

	public void setOgNo(String ogNo) {
		this.ogNo = ogNo;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}

	public String toString() {
		return "Öğrenci Numarası: " + ogNo + "\n" + "Adı Soyadı: " + adSoyad + "\n" + "Sınıf: " + sinif;
	}
}
