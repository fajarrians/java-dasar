public class KonversiNumber {
    public static void main(String[] args) {
//        konversi tipe data number (otomatis)
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

//        konversi tipe data number (manual)
        int iniInt2 = (int) iniShort;
        short iniSHort2 = (short) iniInt2;
        byte iniByte2 = (byte) iniSHort2;
    }
}
