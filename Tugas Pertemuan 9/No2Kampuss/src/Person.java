public class Person {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String email;

    public Person(String nama, String alamat, String noTelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + nama;
    }
}
