// Hilaria Iwung
//227064516036
package aplikasipegawai;

public class Pegawai {
    protected String Nama;
    protected String jenisKelamin;
    protected String noPegawai;
    protected boolean menikah;

    public Pegawai(String Nama, String jenisKelamin, String noPegawai, boolean menikah) {
        this.Nama = Nama;
        this.jenisKelamin = jenisKelamin;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }
    public int getTunjangan() {
        if (menikah) {
            return (jenisKelamin.equalsIgnoreCase("Laki-laki")) ? 200_000 : 150_000;
        } else {
            return 100_000;
        }
    }
    public void toShow() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No Pegawai: " + noPegawai);
        System.out.println("Status Menikah: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
}

