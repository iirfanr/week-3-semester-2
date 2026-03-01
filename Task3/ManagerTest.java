package Task3;  

public class ManagerTest {
    public static void main(String[] args) {
        // Mendeklarasikan dan mengalokasikan array untuk 3 objek Employee
        Employee[] staff = new Employee[3];

        // Mengisi array dengan kombinasi Employee dan Manager (Polimorfisme)
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Menaikkan gaji semua staf sebesar 5%
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(100);
        }

        for (int i = 0; i < 3; i++) {
        if (staff[i].compare(staff[0]) == 0) {
            System.out.println(staff[i].GetName() + " memiliki gaji yang sama dengan " + staff[0].GetName());
        } else if (staff[i].compare(staff[0]) == -1) {
            System.out.println(staff[i].GetName() + " memiliki gaji yang lebih rendah daripada " + staff[0].GetName());
        } else {
            System.out.println(staff[i].GetName() + " memiliki gaji yang lebih tinggi daripada " + staff[0].GetName());
        } }

        // Mencetak data setiap staf
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}
