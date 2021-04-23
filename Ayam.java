package Nanik;

import java.util.*;
    
    public class Ayam extends MahklukHidup{
    Scanner input = new Scanner (System.in);
    int pilihan;
    void data(){
        System.out.println("");
        MahklukHidup data1 = new MahklukHidup();
        System.out.println("nama             : ");
        data1.name= input.nextLine();
        System.out.println("");
        MahklukHidup    data2 = new MahklukHidup();
        System.out.println("Warna            : ");
        data2.warna= input.nextLine();
        
        data1.AyamNama();
        data2.AyamWarna();
        
    }
}
