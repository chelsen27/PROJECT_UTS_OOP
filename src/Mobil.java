class Mobil extends Rental {
    private int Jam;
    private int SetengahHari;
    private int Hari;
    private int perJam = 50000;
    private int perSetengahHari = 500000;
    private int perHari = 800000;

    //constructor Mobil
    public Mobil(String nama, int noHp, String alamat, int Jam, int SetengahHari, int Hari) {
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
        int TotalHargaSetengahHari = 500000;
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