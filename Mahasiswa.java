import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {

    String nama, kelas, matkul;
    int nim;
    public Mahasiswa (String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkul = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put ("1", new Mahasiswa("Putri", "3H", "Struktur Data", 20212001));
        mhs.put ("2", new Mahasiswa("Anggi", "3C", "Basis Data", 20212090));
        mhs.put ("3", new Mahasiswa("Arrow", "3A", "Sistem Operasi", 20212022));

        System.out.println("Masukkan ID : ");
        input = scan.nextLine();
        data = mhs.get(input);

        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ",Kelas : " + data.kelas + ",Mata Kuliah : " + data.matkul + ",Nim : " + data.nim);
        }
    }
}
