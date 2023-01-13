package mahasiswa.java;

public class UKM {
    private String Nomer;
    private String Nama;
    protected String [] kodemaku1=new String[2];
    protected String [] namamaku1=new String[2];
    private int jmlmaku1=0;

    public UKM (String NKG,String NM ){
        this.Nomer=NKG;
        this.Nama=NM;
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
    public String getNomer(){
        return this.Nomer;
    }
    public String getNama(){
        return this.Nama;
    }
    public void daftarMaku1(){
        System.out.println("Jumlah UKM yang dipilih : "+Nomer);
        System.out.println("kategori UKM : "+Nama);
        System.out.println("UKM KAMPUS yang diambil:");
        for (int i=0;i<jmlmaku1;i++){
            System.out.println(kodemaku1[i]);
        }
    }
}
