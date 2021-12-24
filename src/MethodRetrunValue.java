public class MethodRetrunValue {
    public static void main(String[] args) {
        System.out.println(hiting(200,"+",100));
    }
    static int hiting(int value1 , String opersi , int value2){
        if(opersi == "-"){
            return value1 - value2;
        }else if (opersi == "+"){
            return value1 + value2;
        }else {
            return 0;
        }
    }
}
