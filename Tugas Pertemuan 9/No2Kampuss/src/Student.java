public class Student extends Person {
    public static final String FRESHMAN = "Mahasiswa Baru";
    public static final String SOPHOMORE = "Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String nama, String alamat, String noTelp, String email, String status) {
        super(nama, alamat, noTelp, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + nama;
    }
}
