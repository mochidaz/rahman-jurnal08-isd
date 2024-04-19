public class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 31;

        int nimHash = nim.hashCode();
        int namaHash = nama.hashCode();
        int kelasHash = kelas.hashCode();

        int hash = HASH_MULTIPLIER * (nimHash + namaHash + kelasHash);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Mahasiswa)) {
            return false;
        }

        Mahasiswa mhs = (Mahasiswa) obj;

        return nim.equals(mhs.nim) && nama.equals(mhs.nama) && kelas.equals(mhs.kelas);
    }

    @Override
    public String toString() {
        return "nim: " + nim + ", nama: " + nama + ", kelas: " + kelas;
    }
}