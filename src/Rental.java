public class Rental {
    private String nama;
    private int noHp;
    private String alamat;
    private int Jam , SetengahHari, Hari;

    //constructor Rental
    public Rental(String nama, int noHp, String alamat) {
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    //getter and setter Rental
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoHp() {
        return noHp;
    }

    public void setNoHp(String kode) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setBiodata (String nama, int noHp, String alamat){
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
    }


    //getter and setter Mobil dan Motor
    public int getJam() {
        return Jam;
    }

    public void setJam(int jam) {
        Jam = jam;
    }

    public int getSetengahHari() {
        return SetengahHari;
    }

    public void setSetengahHari(int setengahHari) {
        SetengahHari = setengahHari;
    }

    public int getHari() {
        return Hari;
    }

    public void setHari(int hari) {
        Hari = hari;
    }


    public String getTotalHargaJam() {
        return"";
    }

    public String getTotalHargaSetengahHari() {
        return"";
    }

    public String getTotalHargaHari(){
        return "";
    }

    public String getBiodata(){
        return"";
    }
}