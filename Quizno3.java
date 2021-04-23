package Nanik;
import java.util.Scanner;

public class Quizno3 {
    public static void main (String[] args){
        double pembilang ;
        double penyebut ;
        double hasil;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukka Pembilang");
        pembilang = input.nextDouble();
        System.out.println();
        System.out.println("Masukkan penyebut");
        penyebut = input.nextDouble();
        System.out.println();

        hasil = pembilang/penyebut;
        System.out.println("Hasilnya adalah "+ hasil);

    }
}
