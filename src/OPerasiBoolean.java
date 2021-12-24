public class OPerasiBoolean {
    public static void main(String[] args) {
        var nilaiAbsen = 80;
        var nilaiAkhir = 90;

        boolean lulusAbsen = nilaiAbsen >= 75;
        boolean lulusNilai = nilaiAkhir >=75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus); //hasil outnya = true
    }
}
