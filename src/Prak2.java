import java.util.Scanner;

public class Prak2 {
    public static void main(String[] args) { // menggunakan variabel lokal
        Scanner input = new Scanner(System.in); // Membuat scanner baru
        System.out.println("Program Konversi Suhu");
        System.out.println("============================");
        System.out.println("| 1. Celcius ke Reamur     |");
        System.out.println("| 2. Celcius ke Fahrenheit |");
        System.out.println("| 3. Celcius ke Kelvin     |");
        System.out.println("============================");
        System.out.print("Silahkan Masukkan Pilihan Anda (Pilih Nomornya) : ");
        int pilihan = input.nextInt(); // User diminta memasukkan pilihan nomor program untuk dijalankan
        if (pilihan == 1){ // Percabangan if (jika user memilih angka 1, makan jalankan program penghitungan Celcius
            System.out.println(""); // Memberi jarak
            System.out.println("Yang Anda Pilih Adalah Konversi Suhu Dari Celcius ke Reamur");
            System.out.print("Masukkan Nilai Celcius yang Ingin Dikonversi ke Reamur : ");
            double ncelcius = input.nextDouble(); // User diminta memasukkan nilai celcius untuk dikonversi menjadi reamur
            double reamur = (0.8)*ncelcius; // Masukkan rumus konversi celcius ke reamur
            System.out.println(""); // Memberi jarak
            System.out.println("Hasil : " + reamur + " Reamur"); // Menampilkan hasil konversi
            System.out.println("Cara Penyelesaian : Reamur = (0.8)" + ncelcius + " Celcius"); // Menampilkan cara penyelesaian
        }
        else if (pilihan == 2){ // Percabangan if (jika user memilih angka 1, makan jalankan program penghitungan Fahrenheit
            System.out.println(""); // Memberi jarak
            System.out.println("Yang Anda Pilih Adalah Konversi Suhu Dari Celcius ke Fahrenheit");
            System.out.print("Masukkan Nilai Celcius yang Ingin Dikonversi ke Fahrenheit : ");
            double ncelcius = input.nextDouble(); // User diminta memasukkan nilai celcius untuk dikonversi menjadi fahrenheit
            double fahrenheit = (1.8)*ncelcius+32; // Masukkan rumus konversi celcius ke fahrenheit
            System.out.println(""); // Memberi jarak
            System.out.println("Hasil : " + fahrenheit + " Fahrenheit"); // Menampilkan hasil konversi
            System.out.println("Cara Penyelesaian : fahrenheit = (1.8 x " + ncelcius +" Celcius) " + "+ 32"); // Menampilkan cara penyelesaian
        }
        else if (pilihan == 3){ // Percabangan if (jika user memilih angka 1, makan jalankan program penghitungan Fahrenheit
            System.out.println(""); // Memberi jarak
            System.out.println("Yang Anda Pilih Adalah Konversi Suhu Dari Celcius ke Kelvin");
            System.out.print("Masukkan Nilai Celcius yang Ingin Dikonversi ke Kelvin : ");
            double ncelcius = input.nextDouble(); // User diminta memasukkan nilai celcius untuk dikonversi menjadi kelvin
            double kelvin = ncelcius+32; // Masukkan rumus konversi celcius ke fahrenheit
            System.out.println(""); // Memberi jarak
            System.out.println("Hasil : " + kelvin + " Kelvin"); // Menampilkan hasil konversi
            System.out.println("Cara Penyelesaian : kelvin = " + ncelcius + " Celcius + 32"); // Menampilkan cara penyelesaian
        }
        else{
            System.out.println("Mohon Maaf, Nomor yang Anda Masukkan Tidak Sesuai Dengan yang Tertera Pada Pilihan");
        }
    }
}
