import com.sun.org.apache.bcel.internal.generic.NEW;
import mahasiswa.java.UKM;
import mahasiswa.java.dosen;
import mahasiswa.java.mahasiswa;

public class Main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("9900099","ASEP");
        Matakuliah MAKUL1= new Matakuliah("kd001","1.pemograman java");
        Matakuliah MAKUL2= new Matakuliah("kd002","2.pemograman python");

        mahasiswa mahasiswa2 = new mahasiswa("92020202","dulloh");
        Matakuliah MAKUL11= new Matakuliah("kd0011","1.bahasa jerman");
        Matakuliah MAKUL12= new Matakuliah("kd0012","2. olahraga");

        dosen dosen1 = new dosen("200000920","agus","pedeslohor","28/11/98");
        Matakuliah MAKUL20 = new Matakuliah("kd00112","1.bahasa jepang");
        Matakuliah MAKUL21 = new Matakuliah("kd00112","1.program keteknikan");

        UKM ukm1 =new  UKM("2","internal Kampus");
        Matakuliah MAKUL30 = new Matakuliah("HT3389","1.PRAMUKA");
        Matakuliah MAKUL31 = new Matakuliah("HT3388","2.KEWIRAUSAHAAN");





        mahasiswa1.setKodemaku1((MAKUL1.getKdmaku1()));
        mahasiswa1.setKodemaku1(MAKUL2.getKdmaku1());
        mahasiswa1.daftarMaku1();
        System.out.println();


        mahasiswa2.setKodemaku1((MAKUL11.getKdmaku1()));
        mahasiswa2.setKodemaku1(MAKUL12.getKdmaku1());
        mahasiswa2.daftarMaku1();


        dosen1.setKodemaku1((MAKUL20.getKdmaku1()));
        dosen1.setKodemaku1(MAKUL21.getKdmaku1());
        dosen1.daftarMaku1();

        ukm1.setKodemaku1((MAKUL30.getKdmaku1()));
        ukm1.setKodemaku1(MAKUL31.getKdmaku1());
        ukm1.daftarMaku1();


    }
}