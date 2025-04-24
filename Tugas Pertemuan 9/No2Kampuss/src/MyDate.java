public class MyDate {
    private int tahun, bulan, hari;

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    @Override
    public String toString() {
        return hari + "/" + bulan + "/" + tahun;
    }
}
