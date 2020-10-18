import javax.management.StandardEmitterMBean;
class Motor extends Rental {
    private int Jam;
    private int SetengahHari;
    private int Hari;
    private int perJam = 5000;
    private int perSetengahHari = 50000;
    private int perHari = 100000;

    //constructor Motor
    public Motor(String nama, int noHp, String alamat, int Jam, int SetengahHari, int Hari) {
        super(nama, noHp, alamat);
        this.Jam = Jam;
        this.SetengahHari = SetengahHari;
        this.Hari = Hari;
    }

    public String getTotalHargaJam() {
        int TotalHargaJam = perJam * this.Jam;
        return ("Berapa jam Yang Anda Inginkan : "+Jam+"\nTotal Harga : "+ TotalHargaJam);
    }

    public String getTotalHargaSetengahHari() {
        int TotalHargaSetengahHari = 50000;
        return ("Total Harga : "+ TotalHargaSetengahHari);
    }

    public String getTotalHargaHari() {
        int TotalHargaHari = perHari * this.Hari;
        return ("Berapa Hari Yang Anda Inginkan : "+Hari+"\nTotal Harga : "+ TotalHargaHari);
    }

    public String getBiodata(){
        return("Nama Customer   : "+super.getNama()+"\nAlamat Customer : "+super.getAlamat()+"\nNomor Telepon   : "+super.getNoHp());
    }
}