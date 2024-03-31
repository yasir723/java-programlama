# Java Programlama 2023-2024 bahar dönemi

## 1. `Random` Sınıfı
Java'da rastgele sayılar üretmek için kullanılan bir sınıftır. Bu sınıf, genellikle oyunlar, simülasyonlar, rastgele seçimler ve diğer birçok uygulama için rastgele sayılara ihtiyaç duyulan durumlarda kullanılır.

Kütüphanesini eklemek için şu kodu kullanabilirsiniz:
```java
import java.util.Random;
```

`main` metodunda kullanımı, 0,1 rakamları rastgele seçecek
```java
public static void main(String[] args) {
  Random rand = new Random();
  int num = rand.nextInt(2);
}
```

**sabit bir sayı ile kullanımı**



- `0 ile 10` arasında seçim yapmak için
```java
public static void main(String[] args) {
  final int MAX = 10;
  Random rand = new Random();
  int num = rand.nextInt(MAX) + 1;
}
```
- `5 ile 15` arasında seçim yapmak için

```java
final int MAX = 15;
final int MIN = 5;
Random rand = new Random();
int randomNumber = rand.nextInt((MAX - MIN) + 1) + MIN;
```

**Önemli metotlar**
```java
int randomNumber = rand.nextInt(100); // 0 ile 99 arasında rastgele bir tamsayı üretir
double randomDouble = rand.nextDouble(); // 0.0 ile 1.0 arasında rastgele bir ondalıklı sayı üretir
boolean randomBoolean = rand.nextBoolean(); // true veya false değerlerinden birini rastgele olarak üretir
float randomFloat = rand.nextFloat(); // 0.0 ile 1.0 arasında bir float sayı üretir.
```
---

## 2. `Scanner` Sınıfı
Java'da kullanıcıdan girdi almak için kullanılan bir sınıftır. Kullanıcıdan klavyeden girdi almak için yaygın olarak kullanılır. Scanner sınıfı, bir girdi akışı üzerinde işlem yapmak için çeşitli yöntemler sağlar ve bu yöntemlerle tamsayılar, ondalıklı sayılar, metin gibi farklı türlerde verileri okuyabiliriz.

Kütüphanesini eklemek için şu kodu kullanabilirsiniz:
```java
import java.util.Scanner;
```

`main` metodunda kullanımı, kullanıcıdan bir string değeri almak için kullanımı
```java
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter your name : ");
  String name = scan.nextLine();
}
```

**Önemli metotlar**
```java
int number = scan.nextInt(); // Klavyeden bir tamsayı girdisi okur
double decimal = scan.nextDouble(); // Klavyeden bir ondalıklı sayı girdisi okur
String text = scan.nextLine(); // Klavyeden bir metin girdisi okur
Boolean bol = scan.nextBoolean(); // Bir boolean değer okur. Kabul edilen değerler "true" veya "false" (büyük/küçük harf duyarlı değildir).
float f = scan.nextFloat(); // Bir float değeri okur.
```

---

## 3. `DecimalFormat` Sınıfı
 Java'da sayıları biçimlendirmek için kullanılan bir sınıftır. Bu sınıf, özel sayı biçimlendirme desenleri kullanarak sayıları belirli bir biçimde biçimlendirmenizi sağlar. Örneğin, ondalık sayıları belirli bir sayıda basamakla veya belirli bir desende biçimlendirebilirsiniz.
 
Önemli bir nokta olarak, bu işlevin dönüş değeri `java.lang.String` türündedir

 
Kütüphanesini eklemek için şu kodu kullanabilirsiniz:
```java
import java.text.DecimalFormat;
```


`main` metodunda kullanımı, noktadan sonra 2 basamak kalacak şekilde yuvarlamak için kullanımı
```java
public static void main(String[] args) {
  DecimalFormat df = new DecimalFormat("#.##");
  double number = 123.456;
  System.out.println(df.format(number));
}
```

---

## 4. `NumberFormat` Sınıfı
Java'da sayıların biçimlendirilmesi için kullanılan bir sınıftır. Bu sınıf, sayıların biçimlendirilmesi ve yerel ayarlar göz önünde bulundurularak uygun biçimde görüntülenmesi için çeşitli yöntemler sağlar. Örneğin, sayıların virgül ile ayrılması, ondalık kısmın görüntülenmesi, binlik ayırıcının kullanılması gibi özellikler bu sınıf tarafından sağlanır.

Kütüphanesini eklemek için şu kodu kullanabilirsiniz:
```java
import java.text.NumberFormat;
```

`main` metodunda kullanımı, yüzde değerlerini biçimlendirmek için NumberFormat sınıfının bir örneğini döndürür, bunun için `getPercentInstance` metodu kullanılır.

```java
public static void main(String[] args) {
  double ratio = 0.75;
  NumberFormat nf = NumberFormat.getPercentInstance();
  System.out.println(nf.format(ratio)); // output: 75%
}
```

belirli bir biçimlendirme için şu kütüphane eklenmeli

```java
import java.util.Locale;
```

`Türk` standartlarına göre para birimi biçimlendirme
```java
public static void main(String[] args) {
  double amount = 1234.56; // Miktarı temsil eden örnek bir sayı
  
  // Türk biçimlendirme ayarlarına sahip bir para birimi biçimlendirme örneği oluştur
  NumberFormat turkishCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("tr-TR"));
  
  // Miktarı Türk Lirası cinsinden biçimlendir
  String formattedAmount = turkishCurrencyFormat.format(amount);
  System.out.println("Biçimlendirilmiş Miktar: " + formattedAmount); // Output: Biçimlendirilmiş Miktar: 1.234,56 ₺
}
```

---
## 5. `IO` Sınıfı
Java'da IO (Input/Output) sınıfı, giriş/çıkış işlemlerini yönetmek için kullanılan bir sınıf kümesini ifade eder. Java'da IO sınıfı, veri akışlarını işlemek, `dosyalardan okuma/yazma yapmak`, ağ üzerinden veri iletişimi gerçekleştirmek gibi çeşitli giriş/çıkış işlemlerini kolaylaştırır.

Kütüphanesini eklemek için şu kodu kullanabilirsiniz:
```java
java.io.*;
```
`* işareti`, bu sınıfa ait tüm metotları tanımlamak anlamına gelmektedir.

Java dilinde `throws IOException` ifadesi, bir metodunun hata durumlarını belirtmek için kullanılır. Bu ifade, bir metodun içinde `IOException` adlı bir istisna (exception) fırlatılabileceğini gösterir. IOException, giriş/çıkış işlemleri sırasında ortaya çıkabilecek bir hata türüdür. Bu hata, dosya okuma/yazma işlemlerinde dosyanın bulunamaması, erişim izinlerinin olmaması gibi durumlarda ortaya çıkabilir.


Metodun kullanımı, metod imzasının hemen yanında yer alır.
```java
public static void URLDissector() throws IOException{
}
```

bir dosya okuma örneği:
Eğer java.IO sınıfa ait olan tüm metotları çağırmak istemezsek, sadece gerekli metodlar çağırmak istersek dosya okumak için bu şekilde yazbiliriz

gerekli tanımlamalar:
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
```

`main` metodunda kullanımı, dosya.txt adlı bir dosyayı okumak için FileReader kullanılır

```java
public static void main(String[] args) {
  try {
          // Okunacak dosyanın yolunu belirtin
          String dosyaYolu = "dosya.txt";
    
          // FileReader ile dosyayı oku
          FileReader fileReader = new FileReader(dosyaYolu);
    
          // BufferedReader ile FileReader'ı kullanarak dosyayı satır satır oku
          BufferedReader bufferedReader = new BufferedReader(fileReader);
    
          // Dosyadan okunan satırı tutacak değişken
          String satir;
    
          // Dosya sonuna kadar oku ve her satırı konsola yazdır
          while ((satir = bufferedReader.readLine()) != null) {
            System.out.println(satir);
          }
    
          // Kullanılan kaynakları serbest bırak
          ufferedReader.close();
   } catch (IOException e) {
          ystem.out.println("Dosya okuma hatası: " + e.getMessage());
   }
}
```

**`useDelimiter`** metodu, bir Scanner nesnesinin girdi dizesini parçalamak için kullanılan bir deseni belirtmenizi sağlar. Yani, girdi dizesini belirli bir desene göre böler ve parçalara ayırır. Bu desen, bir karakter veya karakter dizisi olabilir.
Örneğin, bir metin dosyasındaki her satırı okurken, her satırı boşluk karakterine göre parçalamak istiyorsanız, useDelimiter metodunu boşluk karakteriyle çağırabilirsiniz:

```java
Scanner scanner = new Scanner(dosya);
scanner.useDelimiter(" ");
```
Bu durumda, her çağrıda next() veya nextLine() metodu, bir sonraki boşluk karakterine kadar olan kısmı döndürecektir. Bu şekilde, girdi dizesini istediğiniz şekilde parçalayabilir ve işleyebilirsiniz.

`useDelimiter` için bir örnek:

dosya.txt:
```txt
Java,Python,C++,JavaScript
HTML,CSS,JavaScript,TypeScript
C#,Java,Python,Ruby
```
`main` metodu:
```java
public static void main(String[] args) {
  try {
    String dosyaYolu = "dosya.txt";

    File dosya = new File(dosyaYolu);
    Scanner scanner = new Scanner(dosya);
    scanner.useDelimiter(",");

    while (scanner.hasNext()) {
      String token = scanner.next();
      System.out.println(token);
    }

    scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Dosya bulunamadı: " + e.getMessage());
    }
}
```
Output:
```
Java
Python
C++
JavaScript
HTML
CSS
JavaScript
TypeScript
C#
Java
Python
Ruby
```
Dosya 3 satırdan oluşuyor ve her bir dil virgülle ayrılmış olarak yazılmış. Ancak çıktıda her bir satır hem satır başı karakterine hem de virgüle göre ayrılmış. UseDelimiter kullanılmasaydı, 3 satır olarak yazdırılacaktı.

**Önemli metotlar**
```java
// Metin dosyasından okuma ve yazma işlemleri için kullanılan sınıflar
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// Dosya işlemleri için temel sınıf
import java.io.File;

// Bayt tabanlı giriş ve çıkış işlemleri için temel soyut sınıflar
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Karakter tabanlı giriş ve çıkış işlemleri için temel soyut sınıflar
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Yazdırma işlemleri için sınıf
import java.io.PrintWriter;

// Nesnelerin serileştirilmesi için arayüz
import java.io.Serializable;

// IO işlemlerinde oluşabilecek istisnalar için sınıf
import java.io.IOException;

```

---
## 6. `ArrayList` Sınıfı
- Bir ArrayList nesnesi, ihtiyaç duyulduğunda büyür ve küçülür, gerektiğinde kapasitesini ayarlar.
- ArrayList'in index değerleri 0'dan başlar.
- Ekleme ve silme işlemlerine göre indexler ayarlanır.

Kütüphanesini eklemek için şu kodu kullanabilirsiniz:
```java
import java.util.ArrayList;
```
Listede depolanan nesnenin türü, ArrayList nesnesi oluşturulurken belirlenir:
```java
ArrayList<String> names = new ArrayList<String>();
ArrayList<int> numbers = new ArrayList<int>();
ArrayList<Book> books = new ArrayList<Book>();
ArrayList<ogrenci> ogrenciler = new ArrayList<ogrenci>();
```
`Örnek:` Bir grup üyeleri listesini ArrayList içinde saklayan ve güncelleyen bir program:

```java
public static void main (String[] args)
{
  ArrayList<String> band = new ArrayList<String>();
  band.add("Paul");
  band.add("Pete");
  band.add("John");
  band.add("George");
  System.out.println(band);
  int location = band.indexOf("Pete");
  band.remove (location);
  System.out.println(band);
  System.out.println("At index 1: " + band.get(1));
  band.add(2, "Ringo");
  System.out.println("Size of the band: " + band.size());
  int index = 0;
  while (index < band.size())
  {
    System.out.println(band.get(index));
    index++;
  }
}
```

**Önemli metotlar**
```java

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

```

---
## 6. `swing` Sınıfı
Java programlama dilinde GUI (Graphical User Interface - Grafiksel Kullanıcı Arayüzü) bileşenlerini oluşturmak için kullanılan bir kütüphanedir. Java'nın standart sınıf kitaplığının bir parçasıdır ve Java'nın platform bağımsız yapısıyla uyumlu olarak çalışır. Swing, pencere, düğme, metin kutusu gibi GUI bileşenlerini oluşturmanın yanı sıra, kullanıcı etkileşimine yönelik olayları işlemek ve farklı temalarda ve stillerde GUI'ler oluşturmak için birçok araç sağlar.










