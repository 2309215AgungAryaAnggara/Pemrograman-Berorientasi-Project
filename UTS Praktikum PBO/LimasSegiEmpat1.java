public class LimasSegiEmpat1 {

    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        limas1.setLuasAlas(1);
        limas1.setLuasSelubung(1);
        limas1.setTinggi(1);

        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);

        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        tampilkanInfo(limas1);
        tampilkanInfo(limas2);
        tampilkanInfo(limas3);
    }

    public static void tampilkanInfo(LimasSegiEmpat limas) {
        System.out.printf(
            "Limas segi 4 dengan luas alas : %.1f, luas selubung limas : %.1f dan tinggi : %.1f. Luasnya : %.2f, sedangkan volumenya : %.1f%n",
            limas.getLuasAlas(),
            limas.getLuasSelubungLimas(),
            limas.getTinggi(),
            limas.getLuas(),
            limas.getVolume()
        );
    }
}


class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

 
    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

   
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    
    public double getLuasAlas() {
        return this.luasAlas;
    }

    public double getLuasSelubungLimas() {
        return this.luasSelubungLimas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    // luas
    public double getLuas() {
        return this.luasAlas + this.luasSelubungLimas;
    }

    // volume
    public double getVolume() {
        return (1.0 / 3.0) * this.luasAlas * this.tinggi;
    }
}
