public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String noTelp, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, noTelp, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + nama;
    }
}
