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


