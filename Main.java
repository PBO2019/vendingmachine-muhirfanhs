import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ini Adalah tugas PBO Aku");
        System.out.println("");

        Scanner keyboard = new Scanner(System.in);
        ArrayList <String> kopi = new ArrayList<String>();

        MesinKopi robusta = new MesinKopi();
        robusta.setJeniskopi("Robusta");
        robusta.setJumlahstokKopi(40);
        kopi.add(robusta.getJeniskopi());


        MesinKopi arabica = new MesinKopi();
        arabica.setJeniskopi("Arabica");
        arabica.setJumlahstokKopi(20);
        kopi.add(arabica.getJeniskopi());


        MesinKopi flores = new MesinKopi();
        flores.setJeniskopi("Kopi Flores");
        flores.setJumlahstokKopi(30);
        kopi.add(flores.getJeniskopi());

        System.out.println("Menu Kopi");
        for (int i=0; i<kopi.size(); i++){
            int j = i+1;
            System.out.println(j+ " " + kopi.get(i));
        }
        System.out.print("Masukan kopi yang mau dipilih : ");
        int pilihanKopi = keyboard.nextInt() -1;

        ArrayList <String> Topping = new ArrayList<String>();

        Topping Susu = new Topping();
        Susu.setJenisTopping("Susu");
        Susu.setJumlahStokTopping(30);
        Topping.add(Susu.getJenisTopping());

        Topping Gula = new Topping();
        Gula.setJenisTopping("Gula");
        Gula.setJumlahStokTopping(30);
        Topping.add(Gula.getJenisTopping());

        Topping Cream = new Topping();
        Cream.setJenisTopping("Cream");
        Cream.setJumlahStokTopping(30);
        Topping.add(Cream.getJenisTopping());

        System.out.println("Menu Topping");
        for (int a=0; a<Topping.size(); a++){
            int b = a+1;
            System.out.println(b+ " " + Topping.get(a));
        }
        System.out.print("Masukan Topping yang mau dipilih : ");
        int pilihanTopping = keyboard.nextInt() -1;

        System.out.println("Pesanan Anda Adalah " +kopi.get(pilihanKopi)+ " dengan Topping " +Topping.get(pilihanTopping));

    }
}
