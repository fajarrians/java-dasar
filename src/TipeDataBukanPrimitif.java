public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 10;

        Byte iniByte; //error
        Byte iniByte1 = null;

//        System.out.println(iniByte); error
        System.out.println(iniByte1);

//        konversi tipe data primitif ke bukan primitif
        int iniPrimitif = 10;
        Integer iniBukanPrimitif = iniPrimitif;

//        jika tidak sama tipe data
        Integer iniObject = 10;

        short iniShort = iniObject.shortValue();
        long iniLong = iniObject.longValue();

    }
}
