public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String noTelp, String email, String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, noTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + nama;
    }
}
