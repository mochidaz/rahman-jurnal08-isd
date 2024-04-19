import java.util.HashMap;

public class TableMahasiswa {
    private HashMap<Mahasiswa, Integer> map;

    public TableMahasiswa() {
        map = new HashMap<Mahasiswa, Integer>();
    }

    public void insert(Mahasiswa mhs, int nilai) {
        map.put(mhs, nilai);
    }

    public int getNilai(Mahasiswa mhs) {
        return map.get(mhs);
    }

    public void remove(Mahasiswa mhs) {
        map.remove(mhs);
    }

    public float average() {
        float sum = 0;
        for (int nilai : map.values()) {
            sum += nilai;
        }
        return sum / map.size();
    }

    public Mahasiswa[] toArray() {
        Mahasiswa[] arr = new Mahasiswa[map.size()];
        int i = 0;
        for (Mahasiswa mhs : map.keySet()) {
            arr[i] = mhs;
            i++;
        }
        return arr;
    }
}
