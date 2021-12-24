public class Array {
    public static void main(String[] args) {
        String[] stringArray = new String[3];
        stringArray[0] = "Fajar";
        stringArray[1] = "Rian";
        stringArray[2] = "Setyawan";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] nama = {
          "fajar","rian","setyawan"
        };

        System.out.println(nama.length);//panjang array = 3

//        array didalam array
        String[][] members = {
                {"fajar","rian","setyawan"},
                {"rian","setyawan"},
                {"setyawan"}
        };

        System.out.println(members[0][2]); //hasil out = setyawan
    }
}
