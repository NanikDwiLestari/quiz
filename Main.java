import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        PersegiPanjang obj1 = new PersegiPanjang();
        System.out.println("Masuka nilai panjang : ");
        obj1.p = input.nextDouble();
        System.out.println("Masuka nilai lebar : ");
        obj1.l = input.nextDouble();
        obj1.luas();
        obj1.keliling();
    }
}
