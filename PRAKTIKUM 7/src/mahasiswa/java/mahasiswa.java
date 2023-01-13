package mahasiswa.java;

public class mahasiswa {
    private String NIM;
    private String Nama;
    protected String [] kodemaku1=new String[2];
    protected String [] namamaku1=new String[2];
    private int jmlmaku1=0;

    public mahasiswa (String kode,String Nm){
        this.NIM=kode;
        this.Nama=Nm;
    }
    public void setKodemaku1(String kdmaku1){
        kodemaku1[jmlmaku1]=kdmaku1;
        jmlmaku1++;
    }
    public void setNamamaku1 (String Nmmaku1){
        kodemaku1[jmlmaku1]=Nmmaku1;
        jmlmaku1++;
    }
    public int getJmlmaku1(){
        return  this.jmlmaku1;
    }
    public String getNIM(){
        return this.NIM;
    }
    public String getNama(){
        return this.Nama;
    }
    public void daftarMaku1(){
        System.out.println("NIM: "+NIM);
        System.out.println("Nama: "+Nama);
        System.out.println("mata kuliah yang diambil:");
        for (int i=0;i<jmlmaku1;i++){
            System.out.println(kodemaku1[i]);
        }
    }
}
