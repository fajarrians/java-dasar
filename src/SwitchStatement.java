public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Nilai anda sangat bagus");
                break;
            case "B":
            case "C":
                System.out.println("nilai anda cukup");
                break;
            default: //elsenya
                System.out.println("anda salah jurusan");
        }
    }
}
