import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String jenis, nama, alamat;
        int jenisRental;
        int noHp;
        int Jam = 0;
        int SetengahHari = 0;
        int Hari = 0;
        String TotalJam, TotalHari;

        Rental Kendaraan;
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Perentalan Apa Yang Anda Cari ?\n1.Ketik '1' untuk Mobil\n2.Ketik '2' untuk Motor");
        jenis = input.next();
        System.out.println("=================================\n");


        if (jenis.contains("1")) {
            jenis = "Mobil";
        } else if (jenis.contains("2")) {
            jenis = "Motor";
        } else {
            System.out.println("Pilihan Tidak Ditemukan!");
            System.exit(1);
        }

        System.out.println("=================================");
        System.out.println("--------ISI BIODATA ANDA---------");
        System.out.println("=================================");
        System.out.println("Masukkan Nama Anda :");
        nama = input.next();
        System.out.println("Masukkan Alamat Anda :");
        alamat = input.next();
        System.out.println("Masukkan Nomor Telpon Anda :");
        noHp = input.nextInt();
        System.out.println("=================================\n");

        if (jenis.contains("Mobil")) {
            System.out.println("Anda Memilih Rental Mobil");
            System.out.println("Daftar Harga Rental Mobil :\n1.Perjam          :Rp.50000,-\n2.Setengah Hari   :Rp.500000,-\n3.PerHari         :Rp.800000,-");

            System.out.println("=================================================================");
            System.out.println("Jika Anda Memilih perJam Ketik '1' \nJika Anda Memilih Setengah Hari Ketik '2'\nJika Anda Memilih PerHari Ketik '3' ");
            jenisRental = input.nextInt();
            System.out.println("================================================================");


            if (jenisRental == 1) {
                System.out.println("Anda Memilih Rental PerJam");
                System.out.println("Masukkan Jam  : ");
                Jam = input.nextInt();
                Kendaraan = new Mobil(nama, noHp, alamat, Jam, SetengahHari, Hari);
                TotalJam = Kendaraan.getTotalHargaJam();

                System.out.println("\n===================================================");
                System.out.println("------------------STRUK RENTAL---------------------");
                System.out.println("===================================================");
                System.out.println(Kendaraan.getBiodata());
                System.out.println("Kendaraan Yang DiRental : Mobil");
                System.out.println("===================================================");
                System.out.println(TotalJam);
                System.out.println("===================================================");


            } else if (jenisRental == 2) {
                System.out.println("Anda Memilih Rental Setengah Hari");
                Kendaraan = new Mobil(nama, noHp, alamat, Jam, SetengahHari, Hari);
                TotalHari = Kendaraan.getTotalHargaSetengahHari();

                System.out.println("\n===================================================");
                System.out.println("------------------STRUK RENTAL---------------------");
                System.out.println("===================================================");
                System.out.println(Kendaraan.getBiodata());
                System.out.println("Kendaraan Yang DiRental : Mobil");
                System.out.println("===================================================");
                System.out.println(TotalHari);
                System.out.println("===================================================");

            } else if (jenisRental == 3) {
                System.out.println("Anda Memilih Rental PerHari");
                System.out.println("Masukkan Hari : ");
                Hari = input.nextInt();
                Kendaraan = new Mobil(nama, noHp, alamat, Jam, SetengahHari, Hari);
                TotalHari = Kendaraan.getTotalHargaHari();

                System.out.println("\n===================================================");
                System.out.println("------------------STRUK RENTAL---------------------");
                System.out.println("===================================================");
                System.out.println(Kendaraan.getBiodata());
                System.out.println("Kendaraan Yang DiRental : Mobil");
                System.out.println("===================================================");
                System.out.println(TotalHari);
                System.out.println("===================================================");

            } else {
                System.out.println("Pilihan Tidak Ditemukan!");
                System.exit(1);
            }
        }

        if (jenis.contains("Motor")) {
            System.out.println("Anda Memilih Rental Motor");
            System.out.println("Daftar Harga Rental Motor :\n1.Perjam          :Rp.5000,-\n2.Setengah Hari   :Rp.50000,-\n3.PerHari         :Rp.100000,-");

            System.out.println("==============================================================");
            System.out.println("Jika Anda Memilih perJam Ketik '1' \nJika Anda Memilih Setengah Hari Ketik '2'\nJika Anda Memilih PerHari Ketik '3' ");
            jenisRental = input.nextInt();
            System.out.println("=============================================================");


            if (jenisRental == 1) {
                System.out.println("Anda Memilih Rental PerJam");
                System.out.println("Masukkan Jam  : ");
                Jam = input.nextInt();
                Kendaraan = new Mobil(nama, noHp, alamat, Jam, SetengahHari, Hari);
                TotalJam = Kendaraan.getTotalHargaJam();

                System.out.println("\n===================================================");
                System.out.println("------------------STRUK RENTAL---------------------");
                System.out.println("===================================================");
                System.out.println(Kendaraan.getBiodata());
                System.out.println("Kendaraan Yang DiRental : Motor");
                System.out.println("===================================================");
                System.out.println(TotalJam);
                System.out.println("===================================================");


            } else if (jenisRental == 2) {
                System.out.println("Anda Memilih Rental Setengah Hari");
                Kendaraan = new Mobil(nama, noHp, alamat, Jam, SetengahHari, Hari);
                TotalHari = Kendaraan.getTotalHargaSetengahHari();

                System.out.println("\n===================================================");
                System.out.println("------------------STRUK RENTAL---------------------");
                System.out.println("===================================================");
                System.out.println(Kendaraan.getBiodata());
                System.out.println("Kendaraan Yang DiRental : Motor");
                System.out.println("===================================================");
                System.out.println(TotalHari);
                System.out.println("===================================================");

            } else if (jenisRental == 3) {
                System.out.println("Anda Memilih Rental PerJam");
                System.out.println("Masukkan Hari : ");
                Hari = input.nextInt();
                Kendaraan = new Mobil(nama, noHp, alamat, Jam, SetengahHari, Hari);
                TotalHari = Kendaraan.getTotalHargaHari();

                System.out.println("\n===================================================");
                System.out.println("------------------STRUK RENTAL---------------------");
                System.out.println("===================================================");
                System.out.println(Kendaraan.getBiodata());
                System.out.println("Kendaraan Yang DiRental : Motor");
                System.out.println("===================================================");
                System.out.println(TotalHari);
                System.out.println("===================================================");

            } else {
                System.out.println("Pilihan Tidak Ditemukan!");
                System.exit(1);
            }
        }
    }
}