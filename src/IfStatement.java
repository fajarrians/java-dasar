public class IfStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 90;

        if (nilai >=70 && absen >=70){
            System.out.println("anda lulu");
        } else {
            System.out.println("anda tidak lulus");

// else if
        }if (nilai >=90 && absen >= 90){
            System.out.println("NIlai anda A");
        } else if (nilai >= 80 && absen >=80){
            System.out.println("NIlai Anda B");
        }else {
            System.out.println("nilai anda E");
        }
    }
}
