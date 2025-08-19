package ex_04_Operators;

public class ex04_Lab006_interview_concatonation {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String first_name="gaurav";
        String last_name="shelke";
        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+(a+b));
    }
}
