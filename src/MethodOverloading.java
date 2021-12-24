public class MethodOverloading {
    public static void main(String[] args) {
        sey("fajar","Rian");
        sey("fajar");
        sey();
    }

    static void sey(){
        System.out.println("hello");
    }
    static void sey(String name){
        System.out.println("hello "+ name);
    }
    static void sey(String fristname , String lastname){
        System.out.println("hello " + fristname + " " + lastname);
    }
}
