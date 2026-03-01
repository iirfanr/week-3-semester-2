public class TestCylinder { // save as "TestCylinder.java"

    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("ToString=" + c1.toString()
            + " \nradius=" + c1.getRadius()
            + " \nheight=" + c1.getHeight()
            + " \narea=" + c1.getArea()
            + " \nvolume=" + c1.getVolume()
            + " \ncolor=" + c1.getColor());
        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("ToString=" + c2.toString()
            + " \nradius=" + c2.getRadius()
            + " \nheight=" + c2.getHeight()
            + " \narea=" + c2.getArea()
            + " \nvolume=" + c2.getVolume()
            + " \ncolor=" + c2.getColor());
        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("ToString=" + c3.toString()
            + " \nradius=" + c3.getRadius()
            + " \nheight=" + c3.getHeight()
            + " \narea=" + c3.getArea()
            + " \nvolume=" + c3.getVolume()
            + " \ncolor=" + c3.getColor());
        
        Cylinder c4 = new Cylinder(2.0, "blue", 10.0);
        System.out.println("ToString=" + c4.toString()
            + " \nradius=" + c4.getRadius()
            + " \nheight=" + c4.getHeight()
            + " \narea=" + c4.getArea()
            + " \nvolume=" + c4.getVolume()
            + " \ncolor=" + c4.getColor());
    }
}

/* Jelaskan keterhubungannya dengan class Circle!
    Cylinder mewarisi variabel dan method dari circle, dengan setiap method di cylinder menggunakan
    super (constructor) yang berbeda tergantung input yang diberikan.
    
Konsep apa yang diterapkan pada constructor Cylinder? Jelaskan cara kerja,
kelebihan dan kekurangannya!
    constructor Cylinder menggunakan konsep constructor overloading, dimana terdapat beberapa constructor dengan parameter yang berbeda. Cara kerjanya adalah ketika kita membuat objek dari kelas Cylinder, kita dapat memilih constructor mana yang ingin digunakan berdasarkan parameter yang kita berikan. 
    Kelebihan : lebih fleksibel, mudah dibaca, dan mengurangi penulis kode berulang.
    Kekurangan : terlalu banyak constructor dapat membuat kode menjadi lebih kompleks dan sulit untuk dipelihara. coupling lebih ketat.

B. Instruksi – Overriding method getArea():
Metode Overriding dan "Super": Subclass Cylinder mewarisi metode getArea()
dari superclass Circle.
● Cobalah melakukan overriding metode getArea() pada subclass Cylinder
untuk menghitung luas permukaan (2π × radius × tinggi + 2 × luas alas)
tabung, alih-alih luas alasnya saja!
Artinya, jika getArea() dipanggil oleh instans Circle, maka ia akan mengembalikan
luas lingkaran. Namun, jika getArea() dipanggil oleh instans Cylinder, ia akan
mengembalikan luas permukaan tabung.
Jika Anda melakukan override pada getArea() di subclass Cylinder, maka metode
getVolume() tidak akan lagi berfungsi dengan benar. Hal ini terjadi karena
getVolume() akan menggunakan metode getArea() yang sudah ditimpa
(overridden) yang ditemukan di kelas yang sama. (Runtime Java hanya akan
mencari ke superclass jika tidak dapat menemukan metode tersebut di kelas ini).
● Perbaikilah metode getVolume() tersebut!
Petunjuk: Setelah melakukan overriding pada metode getArea() di subclass
Cylinder, Anda dapat memilih untuk memanggil metode getArea() dari superclass
Circle dengan cara memanggil super.getArea().

saat getarea dibuat pada cylinder, get volume menggunakan getarea tersebut, dan membuat hasilnya salah.
hal tersebut diperbaiki dan menggunakan super. sebelum getarea di method getvolume, yang akan memanggil getarea circle.

C. Instruksi – Overriding method getArea():
Sediakan metode toString() pada kelas Cylinder, yang menimpa (override) metode
toString() yang diwarisi dari superclass Circle, sebagai contoh:
@Override
public String toString() { // di dalam kelas Cylinder
return "Cylinder: subclass of " + super.toString() // menggunakan toString() milik
Circle
+ " height=" + height;
}
● Cobalah metode toString() tersebut di dalam kelas TestCylinder! */