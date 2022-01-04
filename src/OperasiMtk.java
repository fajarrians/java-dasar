import java.util.Scanner;

public class OperasiMtk {
    public static void main(String[] args) {
        int angka1, angka2, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka Pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukan angka Kedua: ");
        angka2 = input.nextInt();
        System.out.println("Pilih Operasi");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Pembagian");
        System.out.println("");
        System.out.print("PILIH> ");
        int operasi = input.nextInt();
        switch (operasi){
            case 1 :
                total = angka1 + angka2;
                System.out.println("hasilnya: " + total);
                break;
            case 2 :
                total = angka1 - angka2;
                System.out.println("hasilnya: " + total);
                break;
            case 3:
                total = angka1 * angka2;
                System.out.println("hasilnya: " + total);
                break;
            case 4 :
                total = angka1 / angka2;
                System.out.println("hasilnya: " + total);
                break;
            default:
                System.out.println("Pilih dengan benar");

        }

    }
}
