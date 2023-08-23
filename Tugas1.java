import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

         //2. Menghitung volume bangun ruang        
         //a. Volume Bola =  4/3 x π x r3
         Scanner inputBola = new Scanner(System.in);

        System.out.print("Masukkan Jari Jari : ");
        double jariJari = inputBola.nextDouble();

        double phi = 3.14;
        double volumeBola = 4/3 * phi * jariJari * jariJari;
        System.out.println("Volume Bola Adalah : "+ volumeBola );
        //b. Volume Tabung = phi x r x r x t
        Scanner inputTabung = new Scanner(System.in);

        System.out.println("Masukkan Jari Jari");
        double jariJariTabung = inputTabung.nextDouble();

        System.out.println("Masukkan Tinggi Tabung : ");
        double tinggiTabung = inputTabung.nextDouble();

        double volumeTabung = 4/3 * phi * jariJari * jariJari;
        System.out.println("Volume Tabung Adalah : " + volumeTabung);
        //c. Volume Kerucut = 1/3 x phi x r x r x t
        Scanner inputKerucut = new Scanner(System.in);

        System.out.println("Masukkan Jari Jari : ");
        double jariJariKerucut = inputKerucut.nextDouble();

        System.out.println("Masukkan Jari Jari : ");
        double JariJariKerucut = inputKerucut.nextDouble();

        System.out.println("Masukkan Tinggi " );
        double tinggiKerucut = inputKerucut.nextDouble();

        double VolumeKerucut = 1/3 * phi * JariJariKerucut * tinggiKerucut;
        System.out.println(VolumeKerucut);
    }
}
