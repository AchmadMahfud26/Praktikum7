package mahasiswa.java;

public class dosen{
    private String NIM;
    private String Nama;
    private String Alamat;
    private String TglLahir;
    protected String [] kodemaku1=new String[2];
    protected String [] namamaku1=new String[2];
    protected String [] kodemaku2=new String[2];
    protected String [] namamaku2=new String[2];

    private int jmlmaku1=0;

    public dosen (String kode,String Nm, String AM, String TL){
        this.NIM=kode;
        this.Nama=Nm;
        this.Alamat=AM;
        this.TglLahir=TL;
    }
    public void setKodemaku1(String kdmaku1){
        kodemaku1[jmlmaku1]=kdmaku1;
        jmlmaku1++;
    }
    public void setNamamaku2 (String Nmmaku1){
        kodemaku1[jmlmaku1]=Nmmaku1;
        jmlmaku1++;
    }
    public void setKodemaku2(String kdmaku1){
        kodemaku1[jmlmaku1]=kdmaku1;
        jmlmaku1++;
    }
    public void setNamamaku1 (String Nmmaku1) {
        kodemaku1[jmlmaku1] = Nmmaku1;
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
    public String getAlamat(){
        return this.Alamat;
    }
    public String getTglLahir(){
        return this.TglLahir;
    }
    public void daftarMaku1(){
        System.out.println("NIM: "+NIM);
        System.out.println("Nama: "+Nama);
        System.out.println("Alamat: "+Alamat);
        System.out.println("Tanggal Lahir: "+TglLahir);
        System.out.println("mata kuliah yang diampu:");
        for (int i=0;i<jmlmaku1;i++){
            System.out.println(kodemaku1[i]);
        }
    }
}

