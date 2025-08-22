package ex_06_Ternary_Operator;

public class Lab005_Nested {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int MAX = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(MAX);
    }
}
