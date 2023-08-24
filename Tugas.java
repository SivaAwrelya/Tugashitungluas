import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Berat Badan : ");
        double Berat = input.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        double Tinggi = input.nextInt();

        double bmi = (Berat/ (Tinggi*Tinggi ));
        System.out.println("BMI : " + bmi );

    }
}
