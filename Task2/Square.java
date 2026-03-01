package Task2;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth(); // Atau getLength(), karena keduanya sama
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    
    public void setWidth(double side) {
        setSide(side); // Override setWidth untuk menjaga geometri persegi
    }

    public void setLength(double side) {
        setSide(side); // Override setLength untuk menjaga geometri persegi
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

/* Superclass Shape dan Subclass-nya: Circle, Rectangle, dan Square.

●	Apakah Anda perlu melakukan override pada getArea() dan getPerimeter()? Cobalah!

    tidak perlu. Rectangle dan Square memiliki cara menghitung area dan perimeter yang sama. Yang berbeda hanya bahwa Square memiliki width = length.

●	Override setLength() dan setWidth() untuk mengubah width sekaligus length, guna menjaga geometri persegi!

    public void setWidth(double side) {
        setSide(side); // Override setWidth untuk menjaga geometri persegi
    }

    public void setLength(double side) {
        setSide(side); // Override setLength untuk menjaga geometri persegi
    }

    tanpa override ini, jika kita memanggil salah satunya pada square, hal tersebut akan salah, karena width =/= length.
    saat di override, length dan width akan kembali ke setside dan tetap sama.
 */