// Hilaria Iwung
//227064516036
package aplikasipegawai;

public class Programmer extends Pegawai {
    private int lamaBekerja;
    private double gaji;

    public Programmer(String Nama, String jenisKelamin, String noPegawai, boolean menikah, int lamaBekerja, double gaji) {
        super(Nama, jenisKelamin, noPegawai, menikah);
        this.lamaBekerja = lamaBekerja;
        this.gaji = gaji;
    }
    public double getBonus() {
        if (lamaBekerja < 5) {
            return gaji * 0.05;
        } else {
            return gaji * 0.1;
        }
    }
    @Override
    public void toShow() {
        super.toShow();
    }
}
