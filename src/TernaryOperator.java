public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai >=75){
            ucapan = "kamu lulus";
        }else {
            ucapan = "kamu belum lulus";
        }

        System.out.println(ucapan);

//        ternary

        var nilai1 = 80;
        String ucapan1 = nilai1 >= 75 ? "kamu lulus" : "kamu belum lulus";

        System.out.println(ucapan1);
    }

}
