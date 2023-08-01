// Hilaria Iwung
//227064516036
package aplikasipegawai;

public class Main {

    public static void main(String[] args) {
        System.out.println("Data Pegawai:");
        System.out.println("=========================================");
        // Data Pegawai
        Pegawai pegawai1 = new Pegawai("Hilda", "perempuan", "12345", false);
        pegawai1.toShow();
        System.out.println("Tunjangan: " + pegawai1.getTunjangan());
        System.out.println("=========================================");

        Pegawai pegawai2 = new Pegawai("Gabriel", "Laki-laki", "67890", true);
        pegawai2.toShow();
        System.out.println("Tunjangan: " + pegawai2.getTunjangan());
        System.out.println("=========================================");

        System.out.println("\nData Programmer:");
        System.out.println("=========================================");
        // Data Programmer
        Programmer programmer1 = new Programmer("Safri", "Laki-laki", "54321", false, 5, 8000000);
        programmer1.toShow();
        System.out.println("Tunjangan: " + programmer1.getTunjangan());
        System.out.println("Bonus: " + programmer1.getBonus());
        System.out.println("=========================================");

        Programmer programmer2 = new Programmer("Mawar", "Perempuan", "09876", true, 2, 7000000);
        programmer2.toShow();
        System.out.println("Tunjangan: " + programmer2.getTunjangan());
        System.out.println("Bonus: " + programmer2.getBonus());
        System.out.println("=========================================");

        Programmer programmer3 = new Programmer("Rendy", "Laki-laki", "13579", true, 12, 12000000);
        programmer3.toShow();
        System.out.println("Tunjangan: " + programmer3.getTunjangan());
        System.out.println("Bonus: " + programmer3.getBonus());
        System.out.println("=========================================");
    }
}
