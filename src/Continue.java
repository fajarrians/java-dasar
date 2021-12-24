public class Continue {
    public static void main(String[] args) {
        for (var angka = 1; angka <= 100; angka++){
            if (angka % 2 == 0){
                continue;
            }
            System.out.println("perulangan" + angka);
        }

    }
}
