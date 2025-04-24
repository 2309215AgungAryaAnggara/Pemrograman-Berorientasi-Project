public class TesPerson {
    public static void main(String[] args) {
        Person person = new Person("Ali", "Jakarta", "0812345678", "ali@mail.com");
        Student student = new Student("Budi", "Bandung", "0812123456", "budi@student.com", Student.FRESHMAN);
        Employee employee = new Employee("Citra", "Surabaya", "0898765432", "citra@kantor.com", "IT Dept", 5000000, new MyDate(2020, 5, 20));
        Faculty faculty = new Faculty("Dewi", "Yogyakarta", "0877654321", "dewi@fakultas.com", "Kampus", 8000000, new MyDate(2019, 3, 10), "08.00 - 16.00", "Lektor");
        Staff staff = new Staff("Eko", "Bali", "0811122233", "eko@staff.com", "Administrasi", 4000000, new MyDate(2021, 9, 1), "Manajer");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
