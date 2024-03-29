# Java Programlama 2023-2024 bahar dönemi

## 1. `Random` kullanımı
Java'da rastgele sayılar üretmek için kullanılan bir sınıftır. Bu sınıf, genellikle oyunlar, simülasyonlar, rastgele seçimler ve diğer birçok uygulama için rastgele sayılara ihtiyaç duyulan durumlarda kullanılır

kütüphanesini eklmek için
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

## 2. `Scanner` kullanımı
Java'da kullanıcıdan girdi almak için kullanılan bir sınıftır. Kullanıcıdan klavyeden girdi almak için yaygın olarak kullanılır. Scanner sınıfı, bir girdi akışı üzerinde işlem yapmak için çeşitli yöntemler sağlar ve bu yöntemlerle tamsayılar, ondalıklı sayılar, metin gibi farklı türlerde verileri okuyabiliriz.

kütüphanesini eklmek için
```java
import java.util.Scanner;
```

`main` metodunda kullanımı, kullanıcıdan bir string değer 
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


