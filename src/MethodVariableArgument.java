public class MethodVariableArgument {
    public static void main(String[] args) {
        seySelamat("fajar",80,80,50,50,50);
    }
    static void seySelamat(String nama , int... values){
        int total = 0;
        for (var value : values){
            total += value;
        }
        var finalNilai = total / values.length;

        if (finalNilai >= 75){
            System.out.println("anda lulus" + nama);
        }else {
            System.out.println("anda tidak lulus");
        }
    }
}
