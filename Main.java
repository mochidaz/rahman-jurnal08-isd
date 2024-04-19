// Asumsi saya adalah, multiplier hash yang saya gunakan adalah 31.
// Kemudian rumus hash yang saya gunakan adalah (nimHash + namaHash + kelasHash) * multiplier.

public class Main {
    public static void main(String[] args) {
        TableMahasiswa table = new TableMahasiswa();

        Mahasiswa mhs1 = new Mahasiswa("12345", "Erika Furudo", "KRM-01");
        Mahasiswa mhs2 = new Mahasiswa("343434", "Lambdadelta", "PSY-01");
        Mahasiswa mhs3 = new Mahasiswa("000001", "Bernkastel", "RLG-01");
        Mahasiswa mhs4 = new Mahasiswa("111111", "Willard H. Wright", "KRM-02");

        table.insert(mhs1, 70);
        table.insert(mhs2, 95);
        table.insert(mhs3, 80);
        table.insert(mhs4, 100);

        // Kenapa disebut copy? Karena objeknya beda tapi isinya sama. Untuk pembuktian
        // apakah equals() dan hashCode() berfungsi dengan baik.
        Mahasiswa copy = new Mahasiswa("12345", "Erika Furudo", "KRM-01");

        System.out.println("Nilai " + mhs1.nama + ": " + table.getNilai(copy));

        System.out.println();

        System.out.println("Nilai keseluruhan: ");

        System.out.println();

        for (Mahasiswa mhs : table.toArray()) {
            System.out.println(mhs.nama + ": " + table.getNilai(mhs));
        }

        System.out.println();

        System.out.println("Rata-rata nilai: " + table.average());

        System.out.println();

        table.remove(mhs1);

        System.out.println("Nilai keseluruhan setelah Erika dihapus: ");

        System.out.println();

        for (Mahasiswa mhs : table.toArray()) {
            System.out.println(mhs.nama + ": " + table.getNilai(mhs));
        }

        System.out.println();

        System.out.println("Rata-rata nilai setelah Erika dihapus: " + table.average());
    }
}