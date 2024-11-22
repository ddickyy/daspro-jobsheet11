import java.util.Scanner;
public class Percobaan608 {

    // fungsi
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: "); 
        t = input.nextInt();

        L  = p*l;
        System.out.println("Luas persegi panjang adalah " +L);

        vol = p*l*t;
        System.out.println("Volume balok adalah " +vol);
    }

    // fungsi hitungLuas
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    //fungsi hitungVolume
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    
    //Pertanyaan nomer 2
    public static void TampilHinggaKei (int i) {
        for (int j = 0; j <= 1; j++) {
            System.out.println(j);
        }
    }
    public static int Jumlah (int bill, int bill2) {
        return (bill + bill2);
    }
    public static void TampilJumlah (int bill, int bill2) {
        TampilHinggaKei(Jumlah(bill, bill2));
    }
    //public static void main (String[]args) {
        //int temp = Jumlah (1,1);
        //TampilJumlah(temp, 5);
    //}
}